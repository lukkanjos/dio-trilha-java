import java.text.Format;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            mesada -= valorDoce;
            System.out.println("Joaozinho gastou " + valorDoce + " e restou: " + mesada);
        }
    }   

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
