public class FileCounterVisitor implements Visitor{

    private int filesCount;

    public FileCounterVisitor(){
        this.filesCount=0;
    }

    public int getFilesCount(){
        return this.filesCount;
    }


    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        this.filesCount++;
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        // do nothing because we don't want to count directories
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        this.filesCount++;
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        this.filesCount++;
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        this.filesCount++;
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        this.filesCount++;
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        this.filesCount++;
    }
}
