package fr.pizzeria.model;

public class Pizza {
	
	// Attributs

//		private static int crId;
		public String code;
		public String nom;
		public double prix;
	
	// Constructeurs
		
		public Pizza(String code, String nom, double prix) {
			super();
//			this.crId= crId;
			this.code = code;
			this.nom = nom;
			this.prix = prix;
		}
	
	// Accesseurs 
		

		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		
	// Fonction permettant d'afficher les pizzas
		
		public void affiche(){
			
			System.out.println( code + " -> " + nom + "(" + prix + " €)");
		}


}
