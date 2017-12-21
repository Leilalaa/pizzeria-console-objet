package fr.pizzeria.dao;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzaDaoImpl {
	
	public Pizza[] pizzas;
	
	public PizzaDaoImpl(){
		
		pizzas = new Pizza[100];
		pizzas[0] = new Pizza("PEP","Peperoni",12.5);
		pizzas[1] = new Pizza("MAR","Margherita",14.0);
		pizzas[2] = new Pizza("REIN","La Reine",11.5);
		pizzas[3] = new Pizza("FRO","La 4 fromages",12.0);
		pizzas[4] = new Pizza("CAN","La cannibale",12.5);
		pizzas[5] = new Pizza("SAV","La savoyarde",13.0);
		pizzas[6] = new Pizza("ORI","L\'orientale",13.5);
		pizzas[7] = new Pizza("IND","L\'indienne",14.5);
		
	}
	
	// Lister les pizzas
	public Pizza[] findAllPizzas(){
		return pizzas;
	}
	
	// Ajouter une pizza
	public boolean saveNewPizza(Pizza pizza) throws PizzaException {
		
		boolean pizzaSauvegarde = false; // On verifie qu'on est bien rentré ds boucle sinon on génere exception
		
		for(int i = 0; i<pizzas.length; i++){
			if (pizzas[i]==null){
				pizzas[i]= pizza;
				pizzaSauvegarde = true;
				break;
			}	
		}
		
		if (!pizzaSauvegarde){
			throw new PizzaException("Le tableau est plein");
		}
		
		return false;
	}
	
	// Modifier une pizza
	
	public boolean updatePizza(String choixCode, Pizza pizza){
	
		for(int i = 0; i<pizzas.length; i++){
			pizza.affiche();
			if(pizzas[i] != null && pizzas[i].getCode().equals(choixCode)){
				pizzas[i] = pizza;
				break;
			}
		}
		
		return false;
	}
	
	// Supprimer une pizza
	
	public boolean deletePizza(String choixCode){
		
		Scanner sc = new Scanner(System.in);
		// On parcours le tableau, si on retrouve le code, maj de la pizza
		for (int i = 0; pizzas[i]!=null; i++) {

			if(pizzas[i].getCode().equals(choixCode)){

				

				pizzas[i]=null;
				sc.close();
				break;
				
			
			}
		}
		return false;
	}

}
