package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;



public class SupprimerPizzaOptionMenu extends OptionMenu {
	
	String choixCode;
	
	public SupprimerPizzaOptionMenu(Scanner sc, Pizza[] pizzas) {
		super(sc, pizzas);

	}
	
	public String getLibelle(){
		
		return "4. Supprimer une pizza";
	}

	public void execute(){
		
		System.out.println("Suppression d\'une pizza");
		
		for (int i = 0; pizzas[i]!=null; i++) {
			System.out.println( pizzas[i].code + " -> " + pizzas[i].nom + "(" + pizzas[i].prix + ")");
		}
		System.out.println("Veuillez choisir la pizza a modifier\n");
		System.out.println("99 pour abandonner\n");
		choixCode = sc.next();
		
		if(choixCode!="99"){
			
			for (int i = 0; pizzas[i]!=null; i++) {
				if(pizzas[i].getCode().equals(choixCode)){
					
					pizzas[i]=null;
					break;
					
				}
			}
			
		}
		
	}

}
