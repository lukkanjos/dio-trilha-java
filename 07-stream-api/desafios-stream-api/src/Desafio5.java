import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaiorQueCinco = numeros.stream()
        .filter(num -> num > 5).toList();

        int mediaNumerosMaiorQueCinco = numerosMaiorQueCinco.stream().reduce(0, (num1, num2) -> num1 + num2) / numerosMaiorQueCinco.size();

        System.out.println(mediaNumerosMaiorQueCinco);
    }
}
