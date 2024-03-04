package ejercicio013;

import java.util.ArrayList;

public class Ejercicio013 {
    public static void main(String[] args) {
        // Primer conjunto de Pokemon
        ArrayList<String> primerConjunto = new ArrayList<>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");

        // Segundo conjunto de Pokemon
        ArrayList<String> segundoConjunto = new ArrayList<>();
        segundoConjunto.add("Bulbasaur");
        segundoConjunto.add("Squirtle");
        segundoConjunto.add("Jigglypuff");

        // comparar los conjuntos de
        boolean sonIguales = primerConjunto.equals(segundoConjunto);


        System.out.println("¿Los conjuntos de pokemon son iguales? " + (sonIguales ? "Sí" : "No"));
    }
}
