package fr.pizzeria.ihm;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;



public class ModifierPizzaOptionMenu extends OptionMenu {
	
	
	
	public ModifierPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}

	public String getLibelle(){
			
			return "3. Mettre à jour une pizza";
	}

	public void execute(){
		
		System.out.println("Mise à jour d\'une pizza");
		
		dao.findAllPizzas();
		
		System.out.println("Veuillez choisir la pizza a modifier\n");
		System.out.println("99 pour abandonner\n");
		String choixCode = sc.next();
		
		if(choixCode!="99"){
		
			dao.updatePizza(choixCode);
		
		}
	
	}
					
		
		
		
	

}
