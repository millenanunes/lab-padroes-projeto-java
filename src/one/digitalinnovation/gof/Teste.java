package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

        // =========================
        // Singleton
        // =========================

        System.out.println("=== Singleton Lazy ===");
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy1 == lazy2);

        System.out.println("=== Singleton Eager ===");
        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager1 == eager2);

        System.out.println("=== Singleton Lazy Holder ===");
        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstance();
        System.out.println(holder1 == holder2);


        // =========================
        // Strategy
        // =========================

        System.out.println("\n=== Strategy ===");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();


        // =========================
        // Facade
        // =========================

        System.out.println("\n=== Facade ===");
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}