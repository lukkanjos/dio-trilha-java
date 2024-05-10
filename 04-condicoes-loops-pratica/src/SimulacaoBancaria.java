import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condicao = true; 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (condicao == true) { 
            
          System.out.println("1. Depositar \n2. Sacar\n3. Consultar Saldo\n4. Encerrar");
          int opcao = scanner.nextInt(); 
          // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
          // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
          switch (opcao) {
            case 1:
              saldo = depositar(scanner, saldo);
              break;
            case 2:
              saldo = sacar(scanner, saldo);
              break;
            case 3:
              consultarSaldo(saldo);
              break;
            case 0: 
              condicao = encerrar();
              break;
            
            default:
              System.out.println("Opção inválida. Tente novamente."); 
          }

            }
        }
           
    static double depositar(Scanner scanner, double saldo) {
      double valorDepositado = scanner.nextDouble();
      saldo += valorDepositado;
      System.out.println("Saldo atual: " + saldo);

      return saldo;
    }
    
    static double sacar(Scanner scanner, double saldo) {
      double valorSaque = scanner.nextDouble();
      
      if (saldo < valorSaque) 
        System.out.println("Saldo insuficiente.");
      else {
        saldo -= valorSaque;
        System.out.println("Saldo atual: " + saldo);
      }
      return saldo;
    }
    
    static void consultarSaldo(double saldo) {
      System.out.println("Saldo atual: " + saldo);
    }
    
    static boolean encerrar() {
      System.out.println("Programa encerrado");
      return false;
    }

    }
 