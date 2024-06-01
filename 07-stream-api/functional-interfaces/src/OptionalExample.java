import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);

        optionalValue.orElse("Default");

        System.out.println(optionalValue);
    }
}