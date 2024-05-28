import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.w3c.dom.events.Event;

public class AgendaEventos{
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTree = new TreeMap<>(eventosMap);
        System.out.println(eventosTree);
    }

    public Evento obterProximoEvento(){
        Evento proximoEvento = null;
        for(Evento evento : eventosMap.values()){
            if(evento >)
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(2024, null, null);
    }

}
