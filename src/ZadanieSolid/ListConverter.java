package ZadanieSolid;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListConverter {
    public static Set<String> getUnieqNames(List<String> names){
        Optional<List> optionalList = Optional.ofNullable(names);
        if(optionalList.isPresent()){
            return names.stream()
                    .collect(Collectors
                            .toSet());
        }
        else{
            return new HashSet<>();
        }
    }
    public static Map<Integer, String> getMapNames(List<String> names){
        Optional<List> optionalList = Optional.ofNullable(names);
        AtomicInteger atomicInteger = new AtomicInteger(1);
        if(optionalList.isPresent()){
            return names.stream()
                    .collect(Collectors
                            .toMap(o -> {
                                        return atomicInteger.getAndIncrement();
                                    },value -> value
                                    ,(value1, value2) -> value1));
        }
        else{
            return new HashMap<>();
        }
    }
}