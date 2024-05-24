import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoa {

    List<Pessoa> listaPessoas;
    
    public OrdenacaoPessoa(){
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenadaIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadaIdade);
        return listaOrdenadaIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenadaAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadaAltura, new CompararAltura());
        return listaOrdenadaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("nome 1", 18, 1.75);
        ordenacaoPessoa.adicionarPessoa("nome 2", 26, 1.62);
        ordenacaoPessoa.adicionarPessoa("nome 3", 56, 1.89);
        ordenacaoPessoa.adicionarPessoa("nome 4", 10, 1.50);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
