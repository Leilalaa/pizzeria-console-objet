package fr.pizzeria.ihm;
import java.sql.SQLException;
import java.util.Scanner;

import static fr.pizzeria.console.PizzeriaAdminConsoleApp.LOG;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.dao.SavePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;



public class AjouterPizzaOptionMenu extends OptionMenu {
	
	// Attributs
	

	String choixCode;
	String choixNom;
	double choixPrix = 0;
	CategoriePizza choixCat;
	
	public AjouterPizzaOptionMenu(Scanner sc, IPizzaDao pizzas) {
		super(sc, pizzas);

	}
	
	public String getLibelle(){
		
		return "2. Ajouter une nouvelle pizza";
	}
	

	public void execute() throws SavePizzaException{
		try{
		LOG.info("Ajout d\'une nouvelle pizza \n");
		
		LOG.info("Veuillez saisir le code\n");
		choixCode = sc.next();
		LOG.info("Veuillez saisir le nom (sans espace)\n");
		choixNom = sc.next();
		LOG.info("Veuillez saisir le prix\n");
		choixPrix = sc.nextDouble();
		if(choixPrix <=0){
			throw new SavePizzaException("Le prix ne peut pas être négatif !");
		}
		LOG.info("Veuillez saisir la categorie de votre pizza (VIANDE, SANS_VIANDE ou POISSON)\n");
		
		CategoriePizza choixCat = CategoriePizza.valueOf(sc.next().toUpperCase());
		
		
		Pizza pizza = new Pizza(choixCode, choixNom, choixPrix, choixCat);
		
		
		dao.saveNewPizza(pizza);
		
		}catch(IllegalArgumentException e) {
			LOG.info("Votre catégorie ne peut être que : VIANDE, SANS_VIANDE ou POISSON !");;
		}
		
	}

}
