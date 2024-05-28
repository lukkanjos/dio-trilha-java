import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicinarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;

        for (Produto produto : estoqueProdutosMap.values()){
            valorTotal += (produto.getQuantidade() * produto.getPreco());
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = new Produto(null, 0, 0);

        for(Produto produto : estoqueProdutosMap.values()){
            if (produtoMaisCaro.getPreco() < produto.getPreco() || produtoMaisCaro.getName() == null)
                produtoMaisCaro = produto;
        }

        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = new Produto(null, 0, 0);

        for(Produto produto : estoqueProdutosMap.values()){
            if (produto.getPreco() < produtoMaisBarato.getPreco() || produtoMaisBarato.getName() == null)
                produtoMaisBarato = produto;
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidade = new Produto(null, 0, 0);
        for(Produto produto : estoqueProdutosMap.values()){
            if(produtoMaiorQuantidade.getQuantidade() < produto.getQuantidade() || produtoMaiorQuantidade.getName() == null)
                produtoMaiorQuantidade = produto;
        }

        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicinarProduto(1, "Camiseta", 5, 30);
        estoqueProdutos.adicinarProduto(3, "Calça", 6, 100);
        estoqueProdutos.adicinarProduto(2, "Blusa", 4, 80);

        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    }
}
