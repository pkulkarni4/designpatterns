package behavioral.interpreter;

public class FirstLetterLowerCase implements Expression{
    private final NoWhiteSpace noWhiteSpace = new NoWhiteSpace();

    @Override
    public String interpret(String context) {
        context=context.substring(0,1).toLowerCase() + context.substring(1);
        return noWhiteSpace.interpret(context);
    }
}
