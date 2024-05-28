import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao){
        dicionarioMap.put(palavra, descricao);
    }

    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisa = null;
        if(!dicionarioMap.isEmpty())
            palavraPesquisa = dicionarioMap.get(palavra);

        return palavraPesquisa;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Amor", "Sentimento afetuoso por algo/alguém");
        dicionario.adicionarPalavra("Deus", "Tudo de bom");
        dicionario.adicionarPalavra("Ódio", "Sentimento de raiva por algo/alguém");

        System.out.println(dicionario.pesquisarPorPalavra("Deus"));

        dicionario.removerPalavra("Ódio");
        dicionario.exibirPalavras();
    }

}
