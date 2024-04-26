public class BoletimEstudantil {

    public static void main (String[] args){

        int nota = 6;

        calcularNota(nota);

    }

    public static void calcularNota(int nota){
        
        if (nota < 6) {
            System.out.print("Reprovado");
        } 

        else {
            System.out.print("Aprovado");
        }

    }
    
}
