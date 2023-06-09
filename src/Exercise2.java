import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static String namesToUpperCase(List<String> input) {
        final List<String> result = input.stream()

                .map(name -> name.toUpperCase())
                .sorted((name1, name2) -> name2.compareTo(name1))
                .collect(Collectors.toList());
       return result.toString();
    }
}
