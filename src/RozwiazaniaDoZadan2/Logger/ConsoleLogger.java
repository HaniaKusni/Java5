package RozwiazaniaDoZadan2.Logger;

public class ConsoleLogger implements IMessageLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}