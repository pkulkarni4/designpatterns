package structural.adapter;

public class PDFUploader implements DocumentUploader{
    @Override
    public void upload() {
        System.out.println("preparing pdf...");
        System.out.println("uploading pdf");
    }
}
