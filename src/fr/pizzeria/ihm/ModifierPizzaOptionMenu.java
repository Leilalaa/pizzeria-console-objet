package fr.pizzeria.ihm;
import java.util.Scanner;

import static fr.pizzeria.console.PizzeriaAdminConsoleApp.LOG;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.dao.SavePizzaException;
import fr.pizzeria.dao.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;



public class ModifierPizzaOptionMenu extends OptionMenu {
	
	
	
	public ModifierPizzaOptionMenu(Scanner sc, IPizzaDao pizzas) {
		super(sc, pizzas);

	}

	public String getLibelle(){
			
			return "3. Mettre à jour une pizza";
	}

	
	public void execute()  { //throws UpdatePizzaException
		try{
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
		LOG.info("Veuillez saisir la categorie de votre pizza (VIANDE, SANS_VIANDE ou POISSON)\n");
		CategoriePizza choixCat = CategoriePizza.valueOf(sc.next().toUpperCase());

		
		dao.updatePizza(choixCode, new Pizza(newCode, newNom, newPrix, choixCat));
	}catch(IllegalArgumentException e) {
		LOG.info("Votre catégorie ne peut être que : VIANDE, SANS_VIANDE ou POISSON !");;
	}
	
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
