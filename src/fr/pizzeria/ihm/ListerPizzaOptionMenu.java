package fr.pizzeria.ihm;
import java.util.List;
import java.util.Scanner;



import static fr.pizzeria.console.PizzeriaAdminConsoleApp.LOG;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;



public class ListerPizzaOptionMenu extends OptionMenu {

	
	public ListerPizzaOptionMenu(Scanner sc, IPizzaDao pizzas) {
		super(sc, pizzas);

	}
	
	public String getLibelle(){
		
		return "1. Afficher la liste des pizzas";
}
	

	
	public void execute(){
		
		List<Pizza> pizzas = dao.findAllPizzas();
		LOG.info("Liste des pizzas");
		for (Pizza pizza : pizzas){
			pizza.affiche();
		}
		
		
	}


}
