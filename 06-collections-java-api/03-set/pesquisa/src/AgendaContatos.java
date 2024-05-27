import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public Set<Contato> contatosConjunto;

    public AgendaContatos(){
        contatosConjunto = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero){
        contatosConjunto.add(new Contato(nome, numero));
    }
    
    public void exibirContatos(){
        System.out.println(contatosConjunto.toString());
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPesquisa = new HashSet<>();

        for (Contato contato : contatosConjunto){
            if (contato.getNome().startsWith(nome)) {
                contatosPesquisa.add(contato);
            }
        }

        return contatosPesquisa;
    }

    public void atualizarNumeroContato(String nome, String novoNumero){
        for (Contato contato : contatosConjunto){
            if(contato.getNome().equalsIgnoreCase(nome))
                contato.setNumeroTelefone(novoNumero);
                break;
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Lucas", "111-111");
        agendaContatos.adicionarContato("Lyncon", "222-222");
        agendaContatos.adicionarContato("Leo", "333-333");

        System.out.println(agendaContatos.pesquisarPorNome("Lucas"));
        
        agendaContatos.atualizarNumeroContato("Lucas", "444-444");
        
        agendaContatos.exibirContatos();
    }

}
