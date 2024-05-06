public class ExemploFor{
    public static void main(String[] args) {
        // for (int carneirinho = 1; carneirinho <= 20; carneirinho++) {
        //     System.out.println("Contando carneirinhos " + carneirinho);
        // }
        // System.out.println("Lyncon dormiu");
        
        // For em array
        String alunos[] = {"Lucas", "Lyncon", "Leonardo", "Karina"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        // For Each
        for (String aluno : alunos)
            System.out.println(aluno);
        }
}