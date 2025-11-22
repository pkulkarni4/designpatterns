package behavioral.chainofresponsibility;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if (LoggerType.CONSOLE.equals(request.getLoggerType())) {
            System.out.println(request.getMessage());
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }
    }
}
