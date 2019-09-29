
import Solid.S.Boss;
import ZadanieFirma.Company;
import ZadanieFirma.Conglomerate;
import ZadanieFirma.Worker;
import ZadanieGra.BoardGame;
import ZadanieGra.BoardGameGenerator;
import ZadanieGra.SimpleBoardGame;
import ZadanieSolid.ConsoleReader;
import ZadanieSolid.FileManager;
import ZadanieSolid.ListConverter;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StartUp {

    public static void main(String[] args) {

        // region OPTIONAL

        //op.isPresent() - zwraca wartosc true jesli obiekt nie jest pust
        //op.ifPresent(x -> x); - jeżeli obiekt nie jest pusty możemy wywołać metodę
        //op.orElse("inna wartosc") -> jeżeli obiekt jest pusty to zwracamy inny
        //op.get() -> zwracamy obiekt
        //op.orElseGet(x -> x) -> jezeli obiekt jest pusty to wywolujemy metode anonimowa
        //op.orElseThrow(x -> x) -> jezeli obiekt jest pusty to rzucamy exception

        Optional<String> op = Optional.ofNullable("Bartosz");

//        if(op.isPresent()){
//            System.out.println(op.get());
//        }
//
//        op.ifPresent(x -> System.out.println(x));

        //endregion

        //region ZAD. 1 OPTIONAL
        //1. wyciagniecie wartosci, ale najpierw sprawdzamy czy istnieje
        //2. jezeli nie istnieje to zwracamy inna wartosc
        //3. jezeli istnieje to wypisuje jej wartosc na ekranie
        //4. jezeli nie istnieje to wyrzucamy wyjatek

        // 1.

        if (op.isPresent()) {
            String temp = op.get();
        }

        //2.

        String temp1 = op.orElseGet(() -> getSomething());

        //3.

        op.ifPresent(x -> System.out.println(x));

        //4.

        //musi to być w bloku try-catch
        // op.orElseThrow(x-> new Exception());

        //endregion

        // region STREAM!!!!

//        List<String> names = Arrays.asList("Bartosz", "Ania", "Tomek", "Bożenka", "Bartosz", "Ania",
//                                          "Michał", "Stefan");
//        System.out.println(names);
//
//        names.stream().forEach(x-> System.out.println(x));
//
//        System.out.println("");
//
//        names.stream()
//                .filter(x -> x.startsWith("B"))
//                .forEach(x-> System.out.println(x));
//
//        System.out.println("");
//
//        names.stream()
//                .filter(x->x.length()>5)
//                .forEach(x-> System.out.println(x));
//
//        System.out.println("");
//
//        String temp2 = names.stream()
//                .distinct()    //wyrzuca duplikaty
//                .collect(Collectors.joining(",","Imiona: "," koniec"));
//
//        System.out.println(temp2);
//
//        //Wyświetlennie całej listy inną metodą niż x -> System.out.println(x)
//        names.stream().forEach(System.out::println);

        //endregion

        //region ZAD.1 STREAM

        //1. Wyświetl wszystkie wartości na ekranie -> foreach
        //2. Wyświetla wszystkie wartości bez duplikatów -> distinct()
        //3. Przefiltruj listę i utwórz nową zawierającą tylko imiona zaczynające się od litery "B" -> filter/ collect
        //4. Utwórz listę zawierającą tylko imiona kobiet, które kończą się na "a" - filter/collect
        //5. Wyswietl 3 i 4 element z listy - skip, limit, foreach
        //6. Sprawdz czy lista zawiera jakiekolwiek imie zaczynające się od "Solid.S" - findany/filter

//        List<String> names = Arrays.asList("Bartosz", "Ania", "Tomek", "Bożenka", "Bartosz", "Ania",
//                "Michał", "Stefan");

//        //1.
//        names.stream().forEach(x -> System.out.println(x));
//
//        System.out.println("");
//
//        //2.
//        names.stream()
//                .distinct()
//                .forEach(x -> System.out.println(x));
//
//        System.out.println("");
//
//        //3.
//        List<String> newList = names.stream()
//                .filter(x -> x.startsWith("B"))
//                .collect(Collectors.toList());
//
//        newList.stream().forEach(x -> System.out.println(x));
//
//        System.out.println("");
//
//        //4.
//        List<String> listA = names.stream()
//                .filter(x -> x.endsWith("a"))
//                .collect(Collectors.toList());
//
//        listA.stream().forEach(x -> System.out.println(x));
//
//        System.out.println("");
//
//        //5.
//        names.stream()
//                .skip(2).limit(2)
//                .forEach(x -> System.out.println(x));
//
//        System.out.println("");
//
//        //6.
//        String result = names.stream()
//                .filter(x -> x.startsWith("S"))
//                .findAny()  //utworzył się optional więc wywołujemy go getem
//                .get();
//
//        System.out.println(result);

        //endregion

        List<Integer> lisInt = Arrays.asList(1, 2, 3, 4, 5);

        lisInt.stream().forEach(x -> {
            x = x * x;
            System.out.println(x);
        });

        System.out.println("");

        lisInt.stream().forEach(x -> System.out.println(x));

        //region ZADANIA Z GRĄ NA STREAMY

        //ZAD.1
        //Naszym zadanie jest znaleźć grę która jest
        // dla więcej niż 4 osób,
        // ocena wyższa lub równa 8,
        // jej koszt nie przekracza 150zł
        // oraz gra posiada tag ‘family’ lub ‘adventure’.

        List<BoardGame> games = BoardGameGenerator.getGames();

        games.stream()
                .filter(x -> x.maxPLayers >= 4)
                .filter(x -> x.rate >= 8)
                .filter(x -> new BigDecimal(500).compareTo(x.price) >= 0)
                .filter(x -> x.tags.contains("family") || x.tags.contains("adventure"))
                .map(x -> x.name)
                .forEach(x -> System.out.println(x));


        List<SimpleBoardGame> inneSortowanie =
                games.stream()
                        .filter(x -> x.maxPLayers >= 4)
                        .filter(x -> x.rate >= 8)
                        .filter(x -> new BigDecimal(150).compareTo(x.price) >= 0)
                        .filter(x -> x.tags.contains("family") || x.tags.contains("adventure"))
                        .map(x -> new SimpleBoardGame(x.name, x.minPlayers, x.maxPLayers))
                        .collect(Collectors.toList());

        // ZAD.2
        //Wypisać na ekranie nazwę gry, min ilość graczy oraz tagi
        // wyfiltruj: ocena mniejsza od 8, minimalna ilość graczy to dwa lub więcej, maksymalna ilość graczy to 5

        games.stream()
                .filter(x -> x.minPlayers >= 2)
                .filter(x -> x.maxPLayers <= 5)
                .filter(x -> x.rate < 8)
                .forEach(x -> {
                    System.out.println("Nazwa: " + x.name);
                    System.out.println("Min ilość graczy: " + x.minPlayers);
                    System.out.println("Max ilość graczy: " + x.maxPLayers);
                });


        // Do maksymalnej jednej wartości np. która gra ma najwyższą ocenę

        BoardGame graNajwyzszaOcena =
                games.stream()
                        .max(Comparator.comparing(x -> x.rate))
                        .get();
        System.out.println(graNajwyzszaOcena.name);


        //endregion

        //region STREAM na tablicy

        String[] array1 = {"1", "2"};
        //1 metoda wywołania
        Arrays.stream(array1)
                .forEach(x -> System.out.println(x));

        // 2 metoda wywołania
        Stream.of("1", "2")
                .forEach(x -> System.out.println(x));

        //endregion


        //region STREAM PO MAPACH

        // Jeżeli nie ma takich samych kluczy
//        List<ZadanieGra.BoardGame> lista =  ZadanieGra.BoardGameGenerator.getGames();
//
//        Map<String, String> tempMap = lista.stream()
//                .collect(Collectors.toMap(x -> x.name, x -> x.tags));
//
//        tempMap.entrySet().stream().forEach(x-> System.out.println(x));

        // Jeżeli klucze się powstarzają w mapie

        List<BoardGame> list = BoardGameGenerator.getGames();
        Map<String, String> temp = list.stream()
                .collect(Collectors.toMap(x -> x.name, x -> x.tags, (o, o2) -> o + ";" + o2));
        temp.entrySet().stream().forEach(x -> System.out.println(x));


        //endregion


        //region ZADANIA ZE STREAMAMI C.D.

        //1.Utworz zbior z nazwami gier
        //2. Wyciągnij średnią ocenę ze wszystkich gier mapToDouble
        //3. Wyciągnij średnią ilość minimalnych graczy mapToInt
        //4. Dla każdego elementu dodaj do nazwy " abc" oraz wyświetl na ekranie peek

        List<BoardGame> list1 = BoardGameGenerator.getGames();


        Set<String> boardSet = list1.stream()
                .map(x -> x.name)
                .collect(Collectors.toSet());

        double avarage = list1.stream()
                .mapToDouble(x -> x.rate)
                .average().getAsDouble();

        int varageMinPlayer = (int) list1.stream()
                .mapToInt(x -> x.minPlayers)
                .average()
                .getAsDouble();


        list1.stream()
                .peek(x -> x.name = x.name + " abc")
                .forEach(x -> System.out.println(x.name));


        //endregion

        //region ZADANIE Z FIRMĄ I PRACOWNIKAMI - trudne sam Bartek się męczył

        Conglomerate conglomerate = new Conglomerate("Volksvagel");
        Company audiComapny = new Company("AudiCompany");
        Company bentleyComapny = new Company("bentleyCompany");
        Worker kielek = new Worker("Bartosz", 26);
        Worker zosia = new Worker("Zosia", 30);
        audiComapny.workers = Arrays.asList(kielek, zosia);
        conglomerate.companies = Arrays.asList(audiComapny, bentleyComapny);

        //Wyciągnąć Zosię

        String zosia1 = Stream.of(conglomerate)
                .map(x -> x.companies)
                .flatMap(Collection::stream)
                .map(x -> x.workers)
                .flatMap(Collection::stream)
                .filter(x -> x.name.equals("Zosia"))
                .map(x -> x.name)
                .findFirst()
                .get();

        System.out.println(zosia1);


        //endregion

        //region ZADANIE STREAM z tablicą

        //Utworz tablicę intów, pomnożyć przez 2 i wyswietl na tablicy

        //Moje rozwiązanie
        Integer[] tablicaInt = {2, 5, 7, 8, 9, 10};

        Stream<Integer> streamInt = Arrays.stream(new Integer[]{2, 5, 7, 8, 9, 10});

        streamInt.forEach(x -> System.out.println(x * 2));

        //Drugie rozwiązanie

//        int[] arrayInt = {1,5,6,8,9};
//
//        Arrays.stream(arrayInt).forEach(x->{
//            x = x * 2;
//            System.out.println(x);
//        });


        //endregion

        //region SOLID

        //S.

        // Boss b1 = new Boss (true, true);

        //endregion

        //region ZADANIE Z ZASADAMI SOLID

        //pobieramy od uzytkownika n imion i zpaisujemy do listy.
        //tworzy zbior z listy lub mape
        //zapisuje do pliku
        //wyswielta na konsoli
        //optional

        ConsoleReader cr = new ConsoleReader();
        FileManager fm = new FileManager("plik.txt");
        List<String> names = cr.ReadFromConsole();
        names.stream().forEach(System.out::println);
        Set<String> uniqueName = ListConverter.getUnieqNames(names);
        uniqueName.stream().forEach(System.out::println);
        Map<Integer, String> mapNames = ListConverter.getMapNames(names);
        mapNames.entrySet().stream().forEach(System.out::println);
        fm.SaveToFile(uniqueName.stream()
                .collect(Collectors.joining(", ", "Imiona: ", ". Koniec imion.")));

        //endregion

        //region ZADANKO DZIWADEŁKO

        //Utwórz metodę w nowej klasie, która przyjmuje jako argument Collection<String> names
        // Sprawdz za pomocą Optional.ifPresent(x -> {..})
        // czy obiekt nie jest null, jesli jest to rzuc exception
        // Jesli nie jest to wypisz na ekranie imiona.
        // Skorzystac z klasy AtomicInteger aby ponumerowac odpowiednio imiona

        try {
            showNames(Arrays.asList("Ania", "Zostia", "Kasia"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //endregion


        //region ZADANIE ZOO do domu z niedzielnych zajęć

        //Napisz program pozwalajacy dodac zwierzeta do ZOO
        // Uzytkownika na poczatku dostaje informacje jakie oraz ile zwierza
        // danego typu juz znajduje sie w zoo.
        // Program zczytuje z pliku informacje i wyswietla je uzytkownikowi.

        //1. Uzytkownik ma mozliwosc dodania nowego typu zwierzecia
        //2. Modyfikacja instniejacej ilosci zwierzat

        //3. Po zakonczeniu dodawania zmian program zapisuje informacje do pliku
        // txt z iloscia gatunkow i ich iloscia

        //dodatkowo dodaj logowanie bledow do pliki
        //zadbaj o zastosowanie SOLID oraz polimorfizmu w swoim programie
        //postaraj sie skorzystac z mechanizmu serializacji do json

        //endregion




    }

        //region METODA DO ZADANIA DZIWADEŁKA

        public static void showNames (Collection < String > names) throws Exception {
            Optional<Collection<String>> optionalNames = Optional.ofNullable(names);
            AtomicInteger i = new AtomicInteger(1);
            optionalNames.ifPresent(x -> {
                x.stream().forEach(y -> {
                    System.out.println(i + ". Imie: " + y);
                    i.getAndIncrement();
                });
            });
            var temp = optionalNames.orElseThrow(
                    () -> new Exception("To jest null"));
        }

        //endregion


        //region METODA DO OPTIONAL

        public static String getSomething () {
            System.out.println("Zawsze się wykonam");
            return "Ania";
        }
        //endregion

    }