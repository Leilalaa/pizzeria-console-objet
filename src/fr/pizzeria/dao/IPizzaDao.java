package fr.pizzeria.dao;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	ArrayList<Pizza> findAllPizzas();
	boolean updatePizza(String choixCode,Pizza pizza);
	boolean saveNewPizza(Pizza pizza) throws SavePizzaException;
	boolean deletePizza(String choixCode);
	
	

}
