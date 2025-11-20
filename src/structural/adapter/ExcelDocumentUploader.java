package structural.adapter;

public class ExcelDocumentUploader implements WordDocumentUploader {
    @Override
    public void uploadWordDocument() {
        System.out.println("Preparing Excel...");
        System.out.println("Uploading Excel");
    }
}
