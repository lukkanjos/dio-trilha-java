import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacoes = () -> "Paz seja convosco";

        List<String> listaSaudacoes = Stream.generate(() -> "Paz seja convosco").limit(5).toList();

        listaSaudacoes.forEach(saudacao -> System.err.println(saudacao));
    }
}
