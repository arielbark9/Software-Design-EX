public interface Visitor {
    // create visit function for each class in the file details hierarchy
    void visit(Mp3FileDetails mp3FileDetails);
    void visit(DirectoryDetails directoryDetails);
    void visit(JpgFileDetails jpgFileDetails);
    void visit(DocxFileDetails docxFileDetails);
    void visit(HtmlFileDetails htmlFileDetails);
    void visit(PptxFileDetails pptxFileDetails);
    void visit(TxtFileDetails txtFileDetails);
}
