import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        List<Integer> numerosDobrados = numeros.stream().map(numero -> numero * 2).toList();

        numerosDobrados.forEach(numero -> System.out.println(numero));
    }
}
