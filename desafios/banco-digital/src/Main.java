public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta contaCorrente = new ContaCorrente(lucas);
        Conta contaPoupanca = new ContaPoupanca(lucas);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(100);
        contaCorrente.transferir(300, contaPoupanca);

        System.out.println(contaCorrente.toString());
        System.out.println(contaPoupanca.toString());
    }
}