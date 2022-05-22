public class SizeCalcVisitor implements Visitor{

    private int size;

    public SizeCalcVisitor(){
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void visit(JpgFileDetails jpgFileDetails){
        size += jpgFileDetails.getSize();
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        size += docxFileDetails.getSize();
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        size += htmlFileDetails.getSize();
    }

    public void visit(Mp3FileDetails mp3FileDetails){
        size += mp3FileDetails.getSize();
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        // do nothing here as we are not interested in directories
    }

    public void visit(PptxFileDetails pptxFileDetails){
        size += pptxFileDetails.getSize();
    }
    public void visit(TxtFileDetails txtFileDetails){
        size += txtFileDetails.getSize();
    }
}
