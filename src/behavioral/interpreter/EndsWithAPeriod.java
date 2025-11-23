package behavioral.interpreter;

public class EndsWithAPeriod implements Expression {
    @Override
    public String interpret(String context) {
        context = context.endsWith(".") ? context : context + ".";
        return context;
    }
}
