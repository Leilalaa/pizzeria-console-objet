package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.model.Pizza;




public class SupprimerPizzaOptionMenu extends OptionMenu {
	
	String choixCode;
	
	public SupprimerPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}
	
	public String getLibelle(){
		
		return "4. Supprimer une pizza";
	}

	public void execute(){
		
		System.out.println("Suppression d\'une pizza");
		
		
		System.out.println("Veuillez choisir la pizza a modifier\n");
		System.out.println("99 pour abandonner\n");
		choixCode = sc.next();
		
		
		
		
		if(choixCode!="99"){
			// On parcours le tableau, si on retrouve le code, maj de la pizza
			for(int i = 0; i<pizzas.length; i++){
				
				if(pizzas[i].getCode().equals(choixCode)){
					

					pizzas[i].setPrix(sc.nextDouble());
					sc.close();
					break;
					
				
				}
			}
			
			//dao.deletePizza(choixCode);
					
		}
	}
}			
			


