import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int number = scanner.nextInt();
        
        System.out.println("Digite a agência da conta: ");
        String agency = scanner.next();
        
        System.out.println("Digite o nome do cliente dessa conta: ");
        String nameClient = scanner.next();
        
        System.out.println("Digite o saldo do cliente: ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
        
    }
}
