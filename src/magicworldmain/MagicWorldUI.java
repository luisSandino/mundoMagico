package magicworldmain;

import com.magicworld.armas.*;
import com.magicworld.characters.*;



public class MagicWorldUI {

	public static void main(String[] args) {
		Mago mago = new Mago();
        Guerrero guerrero = new Guerrero();
        
        Escudo escudo = new Escudo(mago);
        
        System.out.println("Tenemos un " + mago.getNombre() + " con un escudo de  " + mago.magia());
        System.out.println("Tenemos una " + escudo.getNombre() + " que aumenta de vida  " + escudo.vida()+" y de defensa aumenta "+ escudo.defensa());

	}

}
