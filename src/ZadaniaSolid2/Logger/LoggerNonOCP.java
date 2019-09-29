package ZadaniaSolid2.Logger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;



public class LoggerNonOCP {

    private LogTarget logTarget;

    public LoggerNonOCP(LogTarget logTarget) {

        this.logTarget = logTarget;
    }
    public void log(String message) throws Exception {
        switch (logTarget) {
            case CONSOLE:
                System.out.println(message);
                break;
            case FILE:
                Files.write(Paths.get("file.log"),
                        Arrays.asList(message),
                        StandardOpenOption.APPEND);
                break;
            default:
                throw new IllegalArgumentException("Unsupported logging type!");
        }
    }
}