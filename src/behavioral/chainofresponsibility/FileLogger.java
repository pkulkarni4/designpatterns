package behavioral.chainofresponsibility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {
    private final String filePath;

    public FileLogger(Logger nextLogger, String filePath) {
        super(nextLogger);
        this.filePath = filePath;
    }

    @Override
    public void log(LoggerRequest request) {
        if (LoggerType.FILE.equals(request.getLoggerType())) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
                writer.write(request.getMessage() + "\n");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }
    }
}
