/**
 * @author Leila
 *
 */

package fr.pizzeria.console;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.ihm.*;
import fr.pizzeria.model.Pizza;




public class PizzeriaAdminConsoleApp {
	
	
	// Attributs
	
	static Pizza[] pizzas = new Pizza[100];
	
	
	// Création du tableau de pizzas
	
	

//***************************************************************************************************************
//                                       MAIN
//***************************************************************************************************************	
	
	public static void main(String[] args) {
		
		// Remplissage du tableau de pizzas
		pizzas[0] = new Pizza(0,"PEP","Peperoni",12.5);
		pizzas[1] = new Pizza(1,"MAR","Margherita",14.0);
		pizzas[2] = new Pizza(2,"REIN","La Reine",11.5);
		pizzas[3] = new Pizza(3,"FRO","La 4 fromages",12.0);
		pizzas[4] = new Pizza(4,"CAN","La cannibale",12.5);
		pizzas[5] = new Pizza(5,"SAV","La savoyarde",13.0);
		pizzas[6] = new Pizza(6,"ORI","L\'orientale",13.5);
		pizzas[7] = new Pizza(7,"IND","L\'indienne",14.5);
		
		// Initialisation des variables scanner
		int choixMenu = 0;

		
		// Ouverture du scanner
		Scanner sc = new Scanner(System.in);

		// Création des liens avec les autres classes
		PizzaDaoImpl dao = new PizzaDaoImpl;
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
			
			

			switch (choixMenu)
			{

			case 1:
				
				lister.execute();
				
				break;

			case 2:
				
				ajouter.execute();
				
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
		
			
		}

		

		sc.close();
	}

}
