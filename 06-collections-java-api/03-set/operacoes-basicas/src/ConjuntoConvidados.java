import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigo){
        for (Convidado convidado : convidadosSet){
            if(convidado.getCodigo() == codigo){
                convidadosSet.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet.toString());
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Lucas", 1);
        conjuntoConvidados.adicionarConvidado("Lyncon", 2);
        conjuntoConvidados.adicionarConvidado("Leo", 3);
        conjuntoConvidados.adicionarConvidado("Karina", 3);
        
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
