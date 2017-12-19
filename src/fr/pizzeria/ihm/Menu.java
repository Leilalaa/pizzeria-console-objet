package fr.pizzeria.ihm;

public class Menu {
	
	static OptionMenu[] actions = new OptionMenu[5];
	
	public void affiche(){
		
		System.out.println("***** Pizzeria Administration ***** ");
		System.out.println("1. Lister les pizzas ");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza ");
		System.out.println("4. Supprimer une pizza ");
		System.out.println("99. Sortir ");

		System.out.println("Votre choix : ");
	}

}
