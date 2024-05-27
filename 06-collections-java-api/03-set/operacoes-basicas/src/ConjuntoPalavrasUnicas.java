import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    public Set<Palavra> palavrasConjunto;

    public ConjuntoPalavrasUnicas(){
        this.palavrasConjunto = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasConjunto.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        for(Palavra p : palavrasConjunto){
            if(p.getPalavra().equalsIgnoreCase(palavra))
                palavrasConjunto.remove(p);
                break;
        }
    }

    public void verificarPalavra(String palavra){
        boolean isPresent = false;
        for (Palavra p : palavrasConjunto){
            if (p.getPalavra().equalsIgnoreCase(palavra))
                isPresent = true;
        }
        if (isPresent == false){
            System.err.println("A palavra " + palavra + " não está presente no conjunto.");
        } else
            System.err.println("A palavra " + palavra + " está presente no conjunto.");
    }

    public void exibirPalavrasUnicas(){
        System.err.println(palavrasConjunto.toString());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Deus");
        conjuntoPalavrasUnicas.adicionarPalavra("Jesus");
        conjuntoPalavrasUnicas.adicionarPalavra("Amor");

        conjuntoPalavrasUnicas.verificarPalavra("Gratidão");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
