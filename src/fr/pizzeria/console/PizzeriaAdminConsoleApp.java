/**
 * @author Leila
 *
 */

package fr.pizzeria.console;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.dao.SavePizzaException;
import fr.pizzeria.dao.StockageException;
import fr.pizzeria.ihm.*;





public class PizzeriaAdminConsoleApp {
	
	
	// Attributs
	
	static PizzaDaoImpl pizzas = new PizzaDaoImpl();
	
	
	
	// Création du tableau de pizzas
	
	

//***************************************************************************************************************
//                                       MAIN
//***************************************************************************************************************	
	
	public static void main(String[] args) {

		// Initialisation des variables scanner
		int choixMenu = 0;

		
		// Ouverture du scanner
		Scanner sc = new Scanner(System.in);

		// Création des liens avec les autres classes
		//PizzaDaoImpl dao = new PizzaDaoImpl;
		ListerPizzaOptionMenu lister = new ListerPizzaOptionMenu(sc, pizzas);
		AjouterPizzaOptionMenu ajouter = new AjouterPizzaOptionMenu(sc, pizzas);
		ModifierPizzaOptionMenu modifier = new ModifierPizzaOptionMenu(sc, pizzas);
		SupprimerPizzaOptionMenu supprimer = new SupprimerPizzaOptionMenu(sc, pizzas);
		
		
		// Affichage du menu du programme
		
		while (choixMenu != 99)
		{
			System.out.println("***** Pizzeria Administration ***** ");
			System.out.println(lister.getLibelle()); 
			System.out.println(ajouter.getLibelle());
			System.out.println(modifier.getLibelle());
			System.out.println(supprimer.getLibelle());
			System.out.println("99. Sortir ");

			System.out.println("Votre choix : ");
			
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
						
					System.out.println(e.getMessage());
					}
					
				
					
					break;
	
				case 3:
					
					modifier.execute();
					
					break;
	
				case 4:
					
					supprimer.execute();
					
					break;
				}
				
			
				if (choixMenu == 99){
					
					System.out.println("Au revoir :(");
				}
			
			}catch (NumberFormatException e){
				 
				System.out.println(e.getMessage());
			}
		
			
		}

		

		sc.close();
	}

}
