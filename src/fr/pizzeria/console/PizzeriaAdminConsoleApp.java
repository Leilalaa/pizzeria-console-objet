/**
 * @author Leila
 * Application de gestion des stocks d'une pizzeria
 */

package fr.pizzeria.console;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoJdbc;
import fr.pizzeria.dao.SavePizzaException;
import fr.pizzeria.ihm.*;





public class PizzeriaAdminConsoleApp {
	
	
	// Attributs
	
	static IPizzaDao pizzas = new PizzaDaoJdbc();
	static ResourceBundle props = ResourceBundle.getBundle("jdbc");
	
	
	
	// Cr�ation du tableau de pizzas
	
	

//***************************************************************************************************************
//                                       MAIN
//***************************************************************************************************************	
	/**
	 LOG : Logger 
	 */
	public static final Logger LOG = LoggerFactory.getLogger("dev.console");
	
	public static void main(String[] args) {

		// Initialisation des variables scanner
		int choixMenu = 0;

		
		// Ouverture du scanner
		Scanner sc = new Scanner(System.in);

		// Cr�ation des liens avec les autres classes
		//PizzaDaoImpl dao = new PizzaDaoImpl;
		ListerPizzaOptionMenu lister = new ListerPizzaOptionMenu(sc, pizzas);
		AjouterPizzaOptionMenu ajouter = new AjouterPizzaOptionMenu(sc, pizzas);
		ModifierPizzaOptionMenu modifier = new ModifierPizzaOptionMenu(sc, pizzas);
		SupprimerPizzaOptionMenu supprimer = new SupprimerPizzaOptionMenu(sc, pizzas);
		
		
		// Affichage du menu du programme
		
		while (choixMenu != 99)
		{
			LOG.info("***** Pizzeria Administration ***** ");
			LOG.info(lister.getLibelle()); 
			LOG.info(ajouter.getLibelle());
			LOG.info(modifier.getLibelle());
			LOG.info(supprimer.getLibelle());
			LOG.info("99. Sortir ");

			LOG.info("Votre choix : ");
			
			choixMenu = sc.nextInt();
			
			
			try{
	
				switch (choixMenu)
				{
	
				case 1:
					
					lister.execute();
					
					break;
	
				case 2:
				
					try {
						ajouter.execute();
					} catch (SavePizzaException e) {
						
						LOG.info(e.getMessage());
					}
					
				
					
					break;
	
				case 3:
					
					modifier.execute();
					
					break;
	
				case 4:
					
					supprimer.execute();
					
					break;
					
				default:
					
					LOG.info("Cette option n'existe pas !");
					
					break;
				}
				
			
				if (choixMenu == 99){
					
					LOG.info("Au revoir :(");
				}
			
			}catch (NumberFormatException e){
				 
				LOG.info(e.getMessage());
			}
		
			
		}

		

		sc.close();
	}

}
