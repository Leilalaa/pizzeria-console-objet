package fr.pizzeria.dao;

import java.util.ArrayList;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PizzaDaoImpl implements IPizzaDao {
	

	
	public ArrayList<Pizza> listePizza = new ArrayList<Pizza>();
	
	public PizzaDaoImpl(){
		
		listePizza.add(new Pizza("PEP","Peperoni",12.5, CategoriePizza.VIANDE));
		listePizza.add(new Pizza("MAR","Margherita",14.0, CategoriePizza.SANS_VIANDE));
		listePizza.add(new Pizza("REIN","La Reine",11.5, CategoriePizza.VIANDE));
		listePizza.add(new Pizza("FRO","La 4 fromages",12.0, CategoriePizza.SANS_VIANDE));
		listePizza.add(new Pizza("CAN","La cannibale",12.5, CategoriePizza.VIANDE));
		listePizza.add(new Pizza("SAV","La savoyarde",13.0, CategoriePizza.VIANDE));
		listePizza.add(new Pizza("ORI","L\'orientale",13.5, CategoriePizza.VIANDE));
		listePizza.add(new Pizza("IND","L\'indienne",14.5, CategoriePizza.VIANDE));
		
		
	}
	
	// Lister les pizzas
	public ArrayList<Pizza> findAllPizzas(){
		return listePizza;
	}
	
	// Ajouter une pizza
	public boolean saveNewPizza(Pizza pizza) throws SavePizzaException {
	
		listePizza.add(pizza);
		return false;
	}
		
	
	
	// Modifier une pizza
	
	public boolean updatePizza(String choixCode, Pizza pizza){ // throws PizzaUpdateException
	
		for(Pizza p : this.listePizza){

			if(p.getCode().equals(choixCode)){

				this.listePizza.set(this.listePizza.indexOf(p), pizza);

				break;

			} 
//			else {
//				throw new UpdatePizzaException("Ce code de pizza n'existe pas !");
//				}

		}
		
		return false;
	}
	
	// Supprimer une pizza
	
	public boolean deletePizza(String choixCode){
		// On parcours le tableau, si on retrouve le code, maj de la pizza
		Pizza pToDelete = null;
		
		for(Pizza p : this.listePizza){

			if(p.getCode().equals(choixCode)){
				
				this.listePizza.remove(p);
				return true;

			}

		
		}
		
		
		
		return false;

	}

	
}
