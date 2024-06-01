import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("Banana", "Maluco", "Calma", "Besta");
        
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        List<String> palavrasMaisDeCincoCaracteres = palavras.stream().filter(p -> p.length() > 5).toList();

        palavrasMaisDeCincoCaracteres.forEach(palavra -> System.out.println(palavra));
    }
}
