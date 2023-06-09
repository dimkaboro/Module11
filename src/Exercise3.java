import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5");

        String result = list.stream()
                .flatMap(num -> Arrays.stream(num.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
