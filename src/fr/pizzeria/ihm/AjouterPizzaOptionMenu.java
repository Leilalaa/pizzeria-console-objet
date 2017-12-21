package fr.pizzeria.ihm;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.dao.SavePizzaException;
import fr.pizzeria.model.Pizza;



public class AjouterPizzaOptionMenu extends OptionMenu {
	
	// Attributs
	

	String choixCode;
	String choixNom;
	double choixPrix = 0;
	
	public AjouterPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}
	
	public String getLibelle(){
		
		return "2. Ajouter une nouvelle pizza";
	}

	public void execute() throws SavePizzaException{
		System.out.println("Ajout d\'une nouvelle pizza \n");
		
		System.out.println("Veuillez saisir le code\n");
		choixCode = sc.next();
		System.out.println("Veuillez saisir le nom (sans espace)\n");
		choixNom = sc.next();
		System.out.println("Veuillez saisir le prix\n");
		choixPrix = sc.nextDouble();
		if(choixPrix <=0){
			throw new SavePizzaException("Le prix ne peut pas être négatif !");
		}
		
		Pizza pizza = new Pizza(choixCode, choixNom, choixPrix);
		
		
		dao.saveNewPizza(pizza);
		
	}

}
