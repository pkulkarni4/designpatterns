package creational.singleton;

interface LoggerInt {
    void log(String msg);
}

public class Logger implements LoggerInt {
    private static volatile Logger logger;
    private static Object mutex = new Object();

    private Logger(){}

    public static Logger getInstance() {
        Logger result = logger;
        if(result == null) {
            synchronized (mutex) {
                result = logger;
                if(result == null) {
                    logger = result = new Logger();
                }
            }
        }
        return result;
    }
    public void log(String msg) {
        System.out.println(msg);
    }
}
/*
// not thread safe
public final class Logger implements LoggerInt {
    private static Logger INSTANCE = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
*/

/*
enum is thread safe but cannot extend other classes or implement interfaces
public enum Logger{
    INSTANCE;
    public static Logger getInstance(){
        return INSTANCE;
    }
    void log(String msg) {
        System.out.println(msg);
    }
}
*/
