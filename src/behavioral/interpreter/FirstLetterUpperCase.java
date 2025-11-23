package behavioral.interpreter;

public class FirstLetterUpperCase implements Expression {
    private final EndsWithAPeriod endsWithAPeriod = new EndsWithAPeriod();

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toUpperCase() + context.substring(1);
        return endsWithAPeriod.interpret(context);
    }
}
