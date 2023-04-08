package one_digitalinnovation.gof;

import one_digitalinnovation.gof.facade.Facade;
import one_digitalinnovation.gof.singleton.SingletonEager;
import one_digitalinnovation.gof.singleton.SingletonLazy;
import one_digitalinnovation.gof.singleton.SingletonLazyHolder;
import one_digitalinnovation.gof.strategy.Comportamento;
import one_digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one_digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one_digitalinnovation.gof.strategy.ComportamentoNormal;
import one_digitalinnovation.gof.strategy.Robo;

public class Teste {

    // Singleton
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

    // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}
