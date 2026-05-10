//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PatoReal pr = new PatoReal();
        SuperDrone sp = new SuperDrone();
        AdaptadorDrone adaptadorDrone = new AdaptadorDrone(sp);

        System.out.println("El dron hace...");
        sp.beep();
        sp.girarRotor();
        sp.despegar();

        System.out.println("\nEl pato hace...");
        testPato(pr);

        System.out.println("\nEl AdaptadorPato hace...");
        testPato(adaptadorDrone);
    }

    static void testPato(Pato pato) {
        pato.cuaquear();
        pato.volar();
    }
}