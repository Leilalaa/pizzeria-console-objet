package fr.pizzeria.ihm;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.DeletePizzaException;
import fr.pizzeria.dao.PizzaDaoImpl;





public class SupprimerPizzaOptionMenu extends OptionMenu {
	
	String choixCode;
	
	public SupprimerPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}
	
	public String getLibelle(){
		
		return "4. Supprimer une pizza";
	}

	private static final Logger LOG = LoggerFactory.getLogger("dev.console");
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
			


