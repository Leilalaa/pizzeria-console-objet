package fr.pizzeria.dao;


import java.util.List;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	List<Pizza> findAllPizzas();
	boolean updatePizza(String choixCode,Pizza pizza);
	boolean saveNewPizza(Pizza pizza) throws SavePizzaException;
	boolean deletePizza(String choixCode);
	
	

}
