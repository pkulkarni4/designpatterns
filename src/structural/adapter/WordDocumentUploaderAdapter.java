package structural.adapter;

public class WordDocumentUploaderAdapter implements DocumentUploader {
    private WordDocumentUploader documentUploader;

    public WordDocumentUploaderAdapter(WordDocumentUploader wordDocumentUploader) {
        this.documentUploader = wordDocumentUploader;
    }

    public WordDocumentUploaderAdapter(ExcelDocumentUploader excelDocumentUploader) {
        this.documentUploader = excelDocumentUploader;
    }

    @Override
    public void upload() {
        this.documentUploader.uploadWordDocument();
    }
}
