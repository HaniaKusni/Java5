package ZadanieSolid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;
    public ConsoleReader() {
        this.scanner = new Scanner(System.in);
    }
    public List<String> ReadFromConsole() {
        List<String> names = new ArrayList<>();
        System.out.println("Witaj w programie. " +
                "Aby Zakończyć podawanie imion podaj '-'");
        while (true) {
            System.out.println("Podaj imie");
            String name = scanner.nextLine();
            if (name != null) {
                if (name.equals("-")) {
                    break;
                }
                names.add(name);
            }
        }
        return names;
    }
}