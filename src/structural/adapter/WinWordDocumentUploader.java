package structural.adapter;

public class WinWordDocumentUploader implements WordDocumentUploader {
    @Override
    public void uploadWordDocument() {
        System.out.println("Preparing Word...");
        System.out.println("Uploading Word");
    }
}
