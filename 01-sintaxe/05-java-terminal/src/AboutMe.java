import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	public static void main (String[] args) {
		//criando o objeto Scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome");
		String name = scanner.next();
		
		System.out.println("Digite sua idade");
		int age = scanner.nextInt();
		
		System.out.println("Digite sua altura");
		double height = scanner.nextDouble();
		
		System.out.println("Meu nome é " + name);
		System.out.println("Tenho " + age + " anos");
		System.out.println("Minha altura é " + height);
    }
}