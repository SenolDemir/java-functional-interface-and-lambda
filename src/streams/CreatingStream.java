package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStream {


    public static void main(String[] args) {

        // Empty Stream
        Stream<String> emotyStream = Stream.empty();

        // Stream of Collection
        Collection collection = Arrays.asList("a", "b","c","d");
        Stream<String> collectionStream = collection.stream();

        // Stream of an Array (an existing array)
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> arrayStream = Arrays.stream(arr);

        // Stream of an Array (by creating new array)
        Stream<String> arrStream = Stream.of("a", "b", "c", "d");

        // By using Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").add("d").build();

        // By Stream.generate()
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        // "element" seklinde 10 tane String uretiyor


        // Stream of Primitives
        IntStream intStream = IntStream.range(1,3);


        // We can also obtain a stream from an existing list:
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        integerList.stream();




    }
}
