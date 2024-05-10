import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        for (int cont = 0; saque != 0; cont++) {
            double saque = scanner.nextDouble();
            
            if (saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
            else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

        }
        
        System.out.println("Transacoes encerradas.");

        scanner.close(); 
    }
            
}
