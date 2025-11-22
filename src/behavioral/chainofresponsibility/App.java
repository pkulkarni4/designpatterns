package behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        String message = "Hello World!";
        var request = new LoggerRequest(message, LoggerType.CONSOLE);
        Logger logger = buildChain();
        logger.log(request);

        ///

        var withdrawRequest = new WithdrawRequest(20d, Currency.EURO);
        var atm = buildATMChain();
        atm.dispense(withdrawRequest);
    }

    private static Logger buildChain() {
        var fileLogger = new FileLogger(null, "log.txt");
        var consoleLogger = new ConsoleLogger(fileLogger);
        return consoleLogger;
    }

    private static ATM buildATMChain() {
        var eurATM = new EuroATM(null);
        var usATM = new USDATM(eurATM);
        return usATM;
    }
}
