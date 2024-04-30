import java.lang.invoke.StringConcatFactory;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
               
        // Igualdade
        // int age = 18;
        // String name = "Lucas";
        // char sex = 'M';
        // boolean bonito = false;
        // Date dataNascimento = new Date(01/02/2000);

        // Aritméticos
        // double sum = 10.5 + 16.8;
        // int sub = 10 - 9;
        // int mult = 10 * 3;
        // int divite = 10 / 2;
        // int rest = 10 % 2;
        // double result = (10 + 12) * (10 * 5); 
       
        // Unários
        // int number = 5;
        
        // number = - number;
        // System.out.println(number);
        
        // number = number * -1;
        // System.out.println(number);

        // // Incremento e decremento
        // number ++;
        // System.out.println(number);

        // number --;
        // System.out.println(number);

        // // Negação

        // boolean realyTrue = true;

        // System.out.println(!realyTrue);
        
        // realyTrue = !realyTrue;

        // System.out.println(!realyTrue);

        // Ternário
        // String resultado = "";
        // int nota = 6;


        // resultado = nota > 5 ? "Aprovado" : "Reprovado";
        // System.out.println(resultado);

        // Relacionais
        // String name1 = "Lucas";
        // String name2 = new String("Lucas");
        
        // System.out.println(name1.equals(name2));

        // int num1 = 1;
        // int num2 = 2;

        // if (num1 != num2) {
        //     System.out.println("São diferentes");
        // }

        // Lógicos
        boolean condition = true;
        boolean condition2 = false;

        if(condition && condition2) {
            System.out.println("As duas são verdadeiras");
        }
        
        if (condition || condition2) {
            System.out.println("Umas das expressões é verdadeira");
        }
    }
}
