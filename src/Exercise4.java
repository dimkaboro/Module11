import java.util.stream.Stream;

public class Exercise4 {
    public static Stream<Long> generateStream (long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
