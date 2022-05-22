import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from the following options:\n" +
                "f: FileDetails\n" +
                "h: Hamburgers");
        String choice = scanner.nextLine();
        if (choice.equals("f")){
            fileMenu(scanner);
        }
        if (choice.equals("h")){
            hamburgerMenu(scanner);
        }
    }
    public static FileDetails readFileDetails(String path) throws IOException {
        Map<String, FileDetails> files = new HashMap();
        DirectoryDetails root=new DirectoryDetails(null, "root");
        files.put("", root);
        Files.lines(Paths.get(path))
                .map(str -> FileDetailsFactory.getFileDetails(str))
                .peek(f -> files.put(f.getFullName(),f))
                .peek(f -> ((DirectoryDetails)files.get(f.getPath())).addFile(f))
                .collect(Collectors.toList());
        return root;
    }
    public static void fileMenu(Scanner scanner) throws IOException {
        String path="C:\\Users\\ariel\\IdeaProjects\\Software-Design-EX\\Ex7\\files.txt";
        FileDetails root= readFileDetails(path);
        System.out.println("Choose from the following options:\n" +
                "q: quit\n" +
                "c: countFiles\n" +
                "st: statistics\n" +
                "sh: short\n" +
                "sz: size");
        String myString;
        while (!(myString = scanner.nextLine()).equals("q")){
            switch (myString){
                case "c":
                    FileCounterVisitor fileCounterVisitor = new FileCounterVisitor();
                    root.accept(fileCounterVisitor);
                    System.out.println("Found "+fileCounterVisitor.getFilesCount()+" files");
                    break;
                case "sz":
                    SizeCalcVisitor sizeCalcVisitor = new SizeCalcVisitor();
                    root.accept(sizeCalcVisitor);
                    System.out.println("the total size is "+sizeCalcVisitor.getSize()+" bytes");
                    break;
                case "st":
                    StatisticsVisitor statisticsVisitor = new StatisticsVisitor();
                    root.accept(statisticsVisitor);
                    break;
                case "sh":
                    ShortRepVisitor shortRepVisitor = new ShortRepVisitor();
                    root.accept(shortRepVisitor);
                    break;
            }
        }
    }

    public static void hamburgerMenu(Scanner scanner){
        System.out.println("Choose from the following hamburgers:\n" +
                "cl: classic\n" +
                "sp: spicy\n" +
                "la: lamb\n" +
                "hm: homemade");
        String choice="";
        choice = scanner.nextLine();
        Hamburger hamburger = HamburgerFactory.createHamburger(choice);

        choice = "";
        while (!choice.equals("s")) {
            System.out.println("Choose from the following options:\n" +
                    "a: add topping\n" +
                    "s: serve");
            choice = scanner.nextLine();
            if (choice.equals("a")) {
                hamburger = toppingMenu(scanner, hamburger);
            }
            if (choice.equals("s")) {
                System.out.println(hamburger.serve());
            }
        }
    }

    public static Hamburger toppingMenu(Scanner scanner, Hamburger hamburger){
        // factory method
        System.out.println("Choose from the following toppings:\n" +
                "ch: chips\n" +
                "or: onion rings\n" +
                "sa: salad\n" +
                "fe: fried egg");
        String choice = "";
        choice = scanner.nextLine();
        switch (choice){
            case "ch":
                hamburger = new ChipsDecorator(hamburger);
                break;
            case "or":
                hamburger = new OnionRingsDecorator(hamburger);
                break;
            case "sa":
                hamburger = new SaladDecorator(hamburger);
                break;
            case "fe":
                hamburger = new FriedEggDecorator(hamburger);
                break;
        }
        return hamburger;
    }
}
