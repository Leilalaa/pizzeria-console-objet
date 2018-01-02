package fr.pizzeria.ihm;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.dao.SavePizzaException;
import fr.pizzeria.dao.UpdatePizzaException;
import fr.pizzeria.model.Pizza;



public class ModifierPizzaOptionMenu extends OptionMenu {
	
	
	
	public ModifierPizzaOptionMenu(Scanner sc, PizzaDaoImpl dao) {
		super(sc, dao);

	}

	public String getLibelle(){
			
			return "3. Mettre à jour une pizza";
	}

	private static final Logger LOG = LoggerFactory.getLogger("dev.console");
	public void execute() { //throws UpdatePizzaException
		
		LOG.info("Mise à jour d\'une pizza");
		
		dao.findAllPizzas();
		
		LOG.info("Veuillez choisir la pizza a modifier\n");
		LOG.info("99 pour abandonner\n");
		String choixCode = sc.next();
		
		LOG.info("Veuillez saisir le code\n");
		String newCode  = sc.next();
		
//		if(){
//			throw new UpdatePizzaException("Ce code de pizza n'existe pas !");
//		}
//		
		LOG.info("Veuillez saisir le nom (sans espace)\n");
		String newNom = sc.next();
		LOG.info("Veuillez saisir le prix\n");
		double newPrix = sc.nextDouble();

		
		dao.updatePizza(choixCode, new Pizza(newCode, newNom, newPrix));
//		
//		if(choixCode!="99"){
//			for(int i = 0; i<pizzas.length; i++){
//				
//				if(pizzas[i].getCode().equals(choixCode)){
//					
//					System.out.println("Veuillez saisir le code\n");
//					pizzas[i].setCode(sc.next());
//					System.out.println("Veuillez saisir le nom (sans espace)\n");
//					pizzas[i].setNom(sc.next());
//					System.out.println("Veuillez saisir le prix\n");
//					pizzas[i].setPrix(sc.nextDouble());
//					break;
//			dao.updatePizza();
		
//		}
	
	}
					
		
		
		
	

}
