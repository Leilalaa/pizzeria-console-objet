package fr.pizzeria.ihm;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;



public class ListerPizzaOptionMenu extends OptionMenu {

	
	public ListerPizzaOptionMenu(Scanner sc, Pizza[] pizzas) {
		super(sc, pizzas);

	}
	
	public String getLibelle(){
		
		return "1. Afficher la liste des pizzas";
}

	public void execute() {
		System.out.println("Liste des pizzas");
		for (int i = 0; pizzas[i]!=null; i++) {
			System.out.println( pizzas[i].code + " -> " + pizzas[i].nom + "(" + pizzas[i].prix + " €)");
		 } 
	}
	

}
