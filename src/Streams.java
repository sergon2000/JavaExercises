import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream().takeWhile(v -> v < 3).forEach(System.out::println);
        System.out.println("----");
        numbers.stream().dropWhile(v -> v < 3).forEach(System.out::println);

        System.out.println("----");
        //Optional.of(null).stream().forEach(System.out::println);
        Optional.ofNullable(null).stream().forEach(System.out::println);

        System.out.println("----");
        Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
        System.out.println("----");
        Stream.iterate(1, n -> n < 100, n -> n + 2).forEach(System.out::println);
    }
}
