package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaDaoImpl {
	
	public Pizza[] pizzas;
	
	public PizzaDaoImpl(){
		
		Pizza[] pizzas = new Pizza[100];
		pizzas[0] = new Pizza(0,"PEP","Peperoni",12.5);
		pizzas[1] = new Pizza(1,"MAR","Margherita",14.0);
		pizzas[2] = new Pizza(2,"REIN","La Reine",11.5);
		pizzas[3] = new Pizza(3,"FRO","La 4 fromages",12.0);
		pizzas[4] = new Pizza(4,"CAN","La cannibale",12.5);
		pizzas[5] = new Pizza(5,"SAV","La savoyarde",13.0);
		pizzas[6] = new Pizza(6,"ORI","L\'orientale",13.5);
		pizzas[7] = new Pizza(7,"IND","L\'indienne",14.5);
		
	}
	
	public Pizza[] findAllPizzas(){
		return pizzas;
	}
	
	@Override
	public boolean saveNewPizza(Pizza pizza){
		
		for(int i = 0; i<pizzas.length; i++){
			if (pizzas[i]==null){
				pizzas[i]= pizza;
				break;
			}	
		}
	}

}
