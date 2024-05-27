import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosConjunto;

    public CadastroProdutos(){
        produtosConjunto = new HashSet<>();
    }

    public void adicionarProduto(long id, String nome, double preco, int quantidade){
        produtosConjunto.add(new Produto(id, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosConjunto);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosConjunto);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Camiseta", 30, 1);
        cadastroProdutos.adicionarProduto(2, "Calça", 110, 1);
        cadastroProdutos.adicionarProduto(3, "Blusa", 100, 4);

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
