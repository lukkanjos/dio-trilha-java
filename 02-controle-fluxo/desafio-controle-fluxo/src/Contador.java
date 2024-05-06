import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro.");
        int parametroUm = scan.nextInt(); 
        System.out.println("Digite o segundo parâmetro.");
        int parametroDois =  scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O parâmetro DOIS deve ser MAIOR que o parâmetro UM");
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) 
            throw new ParametrosInvalidosException();
        int numeroOcorrencia = parametroDois - parametroUm;
        for (int i = 1; i <= numeroOcorrencia; i++)
            System.out.println("Imprimindo o número " + i);
    }
}
