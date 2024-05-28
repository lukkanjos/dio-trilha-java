import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos(){
        contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        contatosMap.put(nome, numeroTelefone);
    }

    public void removerContato(String nome){
        contatosMap.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPesquisa = null;
        if (!contatosMap.isEmpty())
            numeroPesquisa = contatosMap.get(nome);

        return numeroPesquisa;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Lucas", 1111);
        agendaContatos.adicionarContato("Lyncon", 2222);
        agendaContatos.adicionarContato("Leo", 3333);

        System.out.println(agendaContatos.pesquisarPorNome("Leo"));

        agendaContatos.removerContato("Lucas");
        agendaContatos.exibirContatos();
    }

}
