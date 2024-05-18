public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void digitaliza(){
        System.out.println("Digitalizando");
    }

    public void copia(){
        System.out.println("Copiando");
    }

    public void imprime(){
        System.out.println("Imprimindo");
    }

}
