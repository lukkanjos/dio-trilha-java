import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItem;

    public CarrinhoDeCompras(){
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        
        for(Item i : listaItem){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(i);
            }
        }

        listaItem.removeAll(itensRemovidos);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : listaItem){
            valorTotal += i.getpreco() * i.getQuantidade();
        }
        System.out.println("Valor do carrinho: " + valorTotal);
    }

    public void exibirItens(){
        for (Item i : listaItem){
            System.out.println(i.getNome() + " " + i.getpreco() + " " + i.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Camiseta", 30, 2);
        carrinhoDeCompras.adicionarItem("Calça", 80, 2);
        carrinhoDeCompras.adicionarItem("Blusa", 100, 1);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("blusa");
        carrinhoDeCompras.exibirItens();

    }
}
