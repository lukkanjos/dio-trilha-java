import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public List<Livro> listaLivros;

    public CatalogoLivros(){
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            
            for (Livro livro : listaLivros){
                if(livro.getAutor().equalsIgnoreCase(autor))
                    livrosAutor.add(livro);
            }

        }
        return livrosAutor;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            
            for (Livro livro : listaLivros){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosAnos.add(livro);
                }
            }

        }
        return livrosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroTitulo = null;
        if (!listaLivros.isEmpty()) {

            for(Livro livro : listaLivros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = livro;
                    break;
                }
            }    
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Harry Potter 1", "Rowling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter 2", "Rowling", 1998);
        catalogoLivros.adicionarLivro("Harry Potter 3", "Rowling", 1999);
        catalogoLivros.adicionarLivro("Senhor dos Anéis", "Tolkien", 1954);
        catalogoLivros.adicionarLivro("A Culpa é das estrelas", "John Green", 2012);
    
        System.out.println(catalogoLivros.pesquisarPorTitulo("Harry Potter 1"));
    }

}
