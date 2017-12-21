package fr.pizzeria.ihm;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.model.Pizza;



public class ListerPizzaOptionMenu extends OptionMenu {

	
	public ListerPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}
	
	public String getLibelle(){
		
		return "1. Afficher la liste des pizzas";
}
	
	public void execute(){
		
		Pizza[] pizzas = dao.findAllPizzas();
		System.out.println("Liste des pizzas");
		for (int i = 0; pizzas[i]!=null; i++) {
			pizzas[i].affiche();
		}
		
	}

//	public void execute() {
//		System.out.println("Liste des pizzas");
//		for (int i = 0; pizzas[i]!=null; i++) {
//			System.out.println( pizzas[i].code + " -> " + pizzas[i].nom + "(" + pizzas[i].prix + " €)");
//		 } 
//	}
//	

}
