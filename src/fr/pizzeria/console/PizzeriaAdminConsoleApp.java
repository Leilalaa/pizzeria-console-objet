package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		
		int choixMenu = 0;
		Scanner scInt = new Scanner(System.in);


		// Affichage du menu du programme
		
		while (choixMenu != 99)
		{
			System.out.println("***** Pizzeria Administration ***** ");
			System.out.println("1. Lister les pizzas ");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza ");
			System.out.println("4. Supprimer une pizza ");
			System.out.println("99. Sortir ");

			System.out.println("Votre choix : ");
			
			choixMenu = scInt.nextInt();
			

			switch (choixMenu)
			{

			case 1:
				System.out.println("Liste des pizzas");
				
				break;

			case 2:
				System.out.println("Ajout d’une nouvelle pizza ");
				
				break;

			case 3:
				System.out.println("Mise à jour d’une pizza");
				
				break;

			case 4:
				System.out.println("Suppression d’une pizza");
				
				break;
			}
			
		
		if (choixMenu == 99){
			
			System.out.println("Au revoir :(");
		}
		
			
		}

		

		scInt.close();
	}

}
