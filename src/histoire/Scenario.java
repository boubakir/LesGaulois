package histoire;

import tp.Druide;
import tp.Gaulois;
import tp.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Le gaulois Astérix : « Bonjour à tous»
//		Le romain Minus : « UN GAU... UN GAUGAU...»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « J'abandonne...»
		
		/*Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);  */
		
		
//		Le druide Panoramix : « Bonjour, je suis le druide Panoramix et ma potion peut aller
//		d'une force 5 à 10.»
//		Le druide Panoramix : « Je vais aller préparer une petite potion...»
//		Le druide Panoramix : « Je n'ai pas trouvé tous les ingrédients, ma potion est
//		seulement de force 6.»
//		Le druide Panoramix : « Non, Obélix !... Tu n'auras pas de potion magique !»
//		Le gaulois Obélix : « Par Bélénos, ce n'est pas juste !»
//		Le gaulois Astérix : « Merci Druide, je sens que ma force est 6 fois décuplée.»
//		Le gaulois Astérix : « Bonjour»
//		Le romain Minus : « UN GAU... UN GAUGAU...»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « J'abandonne...»
		


		
		
		
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Romain minus = new Romain("Minus", 6);
		
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.parler();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

		
		
	
		
		/*
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus); */

		
		
		
		
		
		
		
		
		

	}

}
