package tp;
import java.util.Random;

public class Druide {
	
	private String nom;
	
	private int effetPotionMin;
	private int effetPotionMax;
	
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public void parler() {

		if(this.forcePotion > 7) parler ("J'ai préparé une super potion de force " + forcePotion);
		else parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " +
				forcePotion);

	}
	
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		forcePotion = random.nextInt(effetPotionMax - effetPotionMin  + 1) + effetPotionMin;
		
		
	}
	
	/*
	5. Le druide booste les guerriers
	a. Dans la classe “Druide” créer la méthode booster qui prend en paramètre
	d’entrée un gaulois à qui il fait boire la potion.
	b. Modifier la méthode booster pour que le gaulois nommé « Obélix » ne puisse
	pas avoir de potion : le druide dit « Non, Obélix !... Tu n’auras pas de potion
	magique ! ».
	*/
	
	public void booster(Gaulois goulois) {
		// TODO Auto-generated method stub
		if(goulois.getNom().equals("Obélix")) {
			this.parler( "Non, "+goulois.getNom()+ " Tu n’auras pas de potion magique !" );
		}else {
			goulois.boirePotion(forcePotion);
		}
		

	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		for(int i = 0; i < 100; i++) {
			panoramix.preparerPotion();
			panoramix.parler();
			
		}
		
	}
	
	
	
	
	
	
	
	
}