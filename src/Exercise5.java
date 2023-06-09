import java.util.Iterator;

import java.util.stream.Stream;
public class Exercise5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Stream.Builder<T> streamBuilder = Stream.builder();
        while (iterator1.hasNext() || iterator2.hasNext() ) {
            if(iterator1.hasNext()) {
                streamBuilder.add(iterator1.next());
            }
            if(iterator2.hasNext()) {
                streamBuilder.add(iterator2.next());
            }
        }
        return streamBuilder.build();
    }
}
