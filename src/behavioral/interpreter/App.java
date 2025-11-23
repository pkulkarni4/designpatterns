package behavioral.interpreter;

public class App {
    public static void main(String[] args) {
        var context = "_My var";
        var firstLetter = new FirstLetterShouldNotBeUnderscore();
        var res = firstLetter.interpret(context);

        System.out.println(res);

        //
        var context1= "hello world";


        FirstLetterUpperCase firstLetterUpperCase = new FirstLetterUpperCase();
        res = firstLetterUpperCase.interpret(context1);
        System.out.println(res);
    }
}
