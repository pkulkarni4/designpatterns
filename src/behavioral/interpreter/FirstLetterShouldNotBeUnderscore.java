package behavioral.interpreter;

public class FirstLetterShouldNotBeUnderscore implements Expression {
    private final FirstLetterLowerCase cap = new FirstLetterLowerCase();

    @Override
    public String interpret(String context) {
        if(context.startsWith("_")) {
            context = context.substring(1);
        }
        return cap.interpret(context);
    }
}
