package structural.adapter;

import java.util.List;

public class App {
    public static void main(String[] args) {
        DocumentUploader pdf = new PDFUploader();
       /* WordDocumentUploader winWord = new WinWordDocumentUploader();
        winWord.uploadWordDocument();
        */
        // object adapter for word document uploader
        DocumentUploader word = new WordDocumentUploaderAdapter(new WinWordDocumentUploader());
        DocumentUploader excel = new WordDocumentUploaderAdapter(new ExcelDocumentUploader());

        List<DocumentUploader> documentUploaderList = List.of(pdf, word, excel);
        documentUploaderList.forEach(DocumentUploader::upload);

        ///

        LocalizedMessage eng = new EnglishMessage();
        GreetingInt engGreet = new Greeting(eng);
      //  engGreet.print();

        LocalizedMessage french = new FrenchMessageAdapter(new FrenchMessage());
        GreetingInt frenchGreet = new Greeting(french);
      //  frenchGreet.print();

        List<LocalizedMessage> messages = List.of(eng, french);
        messages.forEach(LocalizedMessage::sayHello);

        List<GreetingInt> greetings = List.of(engGreet, frenchGreet);
        greetings.forEach(GreetingInt::print);


    }
}
