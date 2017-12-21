package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;




public class SupprimerPizzaOptionMenu extends OptionMenu {
	
	String choixCode;
	
	public SupprimerPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}
	
	public String getLibelle(){
		
		return "4. Supprimer une pizza";
	}

	public void execute(){
		
		System.out.println("Suppression d\'une pizza");
		
		dao.findAllPizzas();
		
		System.out.println("Veuillez choisir la pizza a modifier\n");
		System.out.println("99 pour abandonner\n");
		choixCode = sc.next();
		
		if(choixCode!="99"){
			
			dao.deletePizza(choixCode);
					
		}
	}
}			
			


