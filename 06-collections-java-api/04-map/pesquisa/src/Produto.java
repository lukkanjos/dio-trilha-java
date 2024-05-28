public class Produto {
    private String name;
    private int quantidade;
    private double preco;

    public Produto(String name, int quantidade, double preco){
        this.name = name;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return name + ", " + quantidade + ", " + preco;
    }
    
}
