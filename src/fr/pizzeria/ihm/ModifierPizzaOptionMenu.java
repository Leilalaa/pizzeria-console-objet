package fr.pizzeria.ihm;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;



public class ModifierPizzaOptionMenu extends OptionMenu {
	
	String choixCode;
	
	
	public ModifierPizzaOptionMenu(Scanner sc, Pizza[] pizzas) {
		super(sc, pizzas);

	}

	public String getLibelle(){
			
			return "3. Mettre à jour une pizza";
	}

	public void execute(){
		
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
		
	}

}
