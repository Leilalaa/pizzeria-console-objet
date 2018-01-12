package fr.pizzeria.ihm;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;





public abstract class OptionMenu {

	protected IPizzaDao dao;
	protected Scanner sc;
	
	public OptionMenu(Scanner sc, IPizzaDao pizzas) {
		this.sc = sc;
		this.dao = pizzas;
	}
	
		
	

}
