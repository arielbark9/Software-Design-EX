public class StatisticsVisitor implements Visitor{

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        float bitrate = mp3FileDetails.getSize() / mp3FileDetails.getLengthSec();
        System.out.println("The bitrate of " + mp3FileDetails.getName() + " is " + Math.round(bitrate) +
                " bytes per second.");

    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        FileCounterVisitor fileCounterVisitor = new FileCounterVisitor();
        directoryDetails.accept(fileCounterVisitor);
        System.out.println("Directory " +
                directoryDetails.getName() + " has " + fileCounterVisitor.getFilesCount() + " files.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        float avg_bpp = jpgFileDetails.getSize() / (float)(jpgFileDetails.getWidth() * jpgFileDetails.getHeight());
        System.out.println("The picture " + jpgFileDetails.getName() +
                " has an average of " + Math.round(avg_bpp) + " bytes per pixel.");
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        float avg_wpp = docxFileDetails.getWords() / docxFileDetails.getPages();
        System.out.println("The file " + docxFileDetails.getName() +
                " has an average of " + Math.round(avg_wpp) + " words per page.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        int numLines = htmlFileDetails.getLines();
        System.out.println("The file " + htmlFileDetails.getName() +
                " contains " + numLines + " lines.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        float avg_slide_size = pptxFileDetails.getSize() / pptxFileDetails.getSlides();
        System.out.println("The average slide size in Presentation " + pptxFileDetails.getName() +
                " is " + Math.round(avg_slide_size) + ".");
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file " + txtFileDetails.getName() +
                " contains " + txtFileDetails.getWords() + " words.");
    }
}
