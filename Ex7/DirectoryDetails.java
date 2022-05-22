import java.sql.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Set;


public class DirectoryDetails extends FileDetails {

    private ArrayList<FileDetails> files;

    public DirectoryDetails(String path, String name){
        super(path,name);
    }

    public void addFile(FileDetails fileDetails){
        if (files == null) {
            files = new ArrayList<FileDetails>();
        }
        files.add(fileDetails);
    }

    @Override
    public void accept(Visitor visitor) {
        for (FileDetails fileDetails : files) {
            fileDetails.accept(visitor);
        }
        visitor.visit(this);
    }
}