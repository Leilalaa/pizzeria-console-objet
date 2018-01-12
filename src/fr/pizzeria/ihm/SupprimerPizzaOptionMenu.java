package fr.pizzeria.ihm;

import java.util.Scanner;

import static fr.pizzeria.console.PizzeriaAdminConsoleApp.LOG;

import fr.pizzeria.dao.DeletePizzaException;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoImpl;





public class SupprimerPizzaOptionMenu extends OptionMenu {
	
	String choixCode;
	
	public SupprimerPizzaOptionMenu(Scanner sc, IPizzaDao pizzas) {
		super(sc, pizzas);

	}
	
	public String getLibelle(){
		
		return "4. Supprimer une pizza";
	}


	public void execute() { //throws DeletePizzaException
		
		LOG.info("Suppression d\'une pizza");
		
		
		LOG.info("Veuillez choisir la pizza a modifier\n");
		LOG.info("99 pour abandonner\n");
		choixCode = sc.next();
//		
//		if(choixCode)
		
		
		
		if(choixCode!="99"){
			// On parcours le tableau, si on retrouve le code, maj de la pizza

			dao.deletePizza(choixCode);
//					
				
		}
			
			

	}
	
}			
			


