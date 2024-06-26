package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoOfensivo;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();

        robo.setComportamento(normal);

        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "03977522");

        
    }
}
