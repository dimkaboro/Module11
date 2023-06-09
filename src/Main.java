import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        // Exercise1
//        List<String> names = Arrays.asList("Ivan", "Peter", "Dmytro", "Oleksandr", "Ksenia", "Anastasia", "Bohdan");
//        String formattedName = Exercise1.formatNames(names);
//        System.out.println(formattedName);
//
//        // Exercise2
//        final List<String> input = Arrays.asList("Ivan", "Peter", "Dmytro", "Oleksandr", "Ksenia", "Anastasia", "Bohdan");
//        String namesToUpper = Exercise2.namesToUpperCase(input);
//        System.out.println(namesToUpper);
//
//        // Exercise4
//
//        long a = 25214903917L;
//        long c = 11L;
//        long m = (long) Math.pow(2, 48);
//        long seed = 0L;
//
//        Stream<Long> randomGenerate = Exercise4.generateStream(a, c, m, seed);
//        randomGenerate.limit(5).forEach(x -> System.out.println(x));

        // Exercise5
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);

        List<Integer> result = Stream.concat(stream1, stream2)
                .sorted(Comparator.comparingInt(e -> new Random().nextInt()))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}