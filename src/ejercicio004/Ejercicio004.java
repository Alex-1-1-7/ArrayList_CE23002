package ejercicio004;
import javax.swing.*;
import java.util.ArrayList;
public class Ejercicio004 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");
        nombresPokemon.add("Eevee");
        nombresPokemon.add("Mewtwo");
        nombresPokemon.add("Gyarados");
        nombresPokemon.add("Snorlax");
        nombresPokemon.add("Vulpix");


        int indiceEspecificado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el un indice para saber que pokemon e encuentra en dicho indice: "));

        // ver que pokemon esta en el indice introducido
        boolean si = false;
        do {
            if (indiceEspecificado >= 0 && indiceEspecificado < nombresPokemon.size()) {
                String pokemonEnIndice = nombresPokemon.get(indiceEspecificado);
                System.out.println("Pokémon en el índice " + indiceEspecificado + ": " + pokemonEnIndice);
                si = true;
            } else {
                JOptionPane.showMessageDialog(null, "El indice introducido esta fuera del rango");
                indiceEspecificado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el un indice para saber que pokemon e encuentra en dicho indice: "));
            }
        }while(!si);
    }
}
