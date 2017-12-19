package fr.pizzeria.console;
import java.util.Scanner;
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
		String choixCode;
		String choixNom;
		double choixPrix = 0;
		
		// Ouverture du scanner
		Scanner sc = new Scanner(System.in);


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
			
			choixMenu = sc.nextInt();
			
			

			switch (choixMenu)
			{

			case 1:
				System.out.println("Liste des pizzas");
				for (int i = 0; pizzas[i]!=null; i++) {
					System.out.println( pizzas[i].code + " -> " + pizzas[i].nom + "(" + pizzas[i].prix + " €)");
				 }
				
				
				break;

			case 2:
				System.out.println("Ajout d\'une nouvelle pizza \n");
				
				System.out.println("Veuillez saisir le code\n");
				choixCode = sc.next();
				System.out.println("Veuillez saisir le nom (sans espace)\n");
				choixNom = sc.next();
				System.out.println("Veuillez saisir le prix\n");
				choixPrix = sc.nextDouble();
				
				// On ajoute la pizza au tableau
				for(int i = 0; i<pizzas.length; i++){
					if (pizzas[i]==null){
						pizzas[i]= new Pizza(i,choixCode,choixNom,choixPrix);
						break;
					}
				}
				
				break;

			case 3:
				
				System.out.println("Mise à jour d\'une pizza");
				
				for (int i = 0; pizzas[i]!=null; i++) {
					System.out.println( pizzas[i].code + " -> " + pizzas[i].nom + "(" + pizzas[i].prix + ")");
				 }
				
				System.out.println("Veuillez choisir la pizza a modifier\n");
				System.out.println("99 pour abandonner\n");
				choixCode = sc.next();
				
				if(choixCode!="99"){
					
					// On parcours le tableau, si on retrouve le code, maj de la pizza
					for(int i = 0; i<pizzas.length; i++){
						
						if(pizzas[i].getCode().equals(choixCode)){
							
							System.out.println("Veuillez saisir le code\n");
							pizzas[i].setCode(sc.next());
							System.out.println("Veuillez saisir le nom (sans espace)\n");
							pizzas[i].setNom(sc.next());
							System.out.println("Veuillez saisir le prix\n");
							pizzas[i].setPrix(sc.nextDouble());
							break;
							
						}
					}
				}
				
				break;

			case 4:
				
				System.out.println("Suppression d\'une pizza");
				
				for (int i = 0; pizzas[i]!=null; i++) {
					System.out.println( pizzas[i].code + " -> " + pizzas[i].nom + "(" + pizzas[i].prix + ")");
				}
				System.out.println("Veuillez choisir la pizza a modifier\n");
				System.out.println("99 pour abandonner\n");
				choixCode = sc.next();
				
				if(choixCode!="99"){
					
					for (int i = 0; pizzas[i]!=null; i++) {
						if(pizzas[i].getCode().equals(choixCode)){
							
							pizzas[i]=null;
							break;
							
						}
					}
					
				}
				
				break;
			}
			
		
		if (choixMenu == 99){
			
			System.out.println("Au revoir :(");
		}
		
			
		}

		

		sc.close();
	}

}
