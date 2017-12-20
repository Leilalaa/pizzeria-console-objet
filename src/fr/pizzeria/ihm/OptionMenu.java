package fr.pizzeria.ihm;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;




public abstract class OptionMenu {

	protected PizzaDaoImpl dao;
	protected Scanner sc;
	
	public OptionMenu(Scanner sc, PizzaDaoImpl dao) {
		this.sc = sc;
		this.dao = dao;
	}
	
		
	

}
