import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optionals {

    public static void main(String[] args) {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        Optional<String> result1 = nonEmptyGender.or(() -> Optional.of("none1"));
        Optional<String> result2 = emptyGender.or(() -> Optional.of("none2"));

        System.out.println(result1.get());
        System.out.println(result2.get());


        nonEmptyGender.ifPresentOrElse(System.out::println, () -> System.out.println("Do something else"));
        emptyGender.ifPresentOrElse(v -> System.out.println(v), () -> System.out.println("Do something else"));

        List<String> list = nonEmptyGender.stream().map(String::toUpperCase).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }
}
