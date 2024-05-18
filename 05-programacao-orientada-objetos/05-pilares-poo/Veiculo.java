public abstract class Veiculo {
    private String placa = "123AAA";

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    public abstract void ligar();
    
    private boolean confereCombustivel(){
        System.out.println("Conferindo combustível");
        return true;
    }
}
