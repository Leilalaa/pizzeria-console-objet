package fr.pizzeria.model;

public class Pizza {
	
	// Attributs

		public int id;
		public String code;
		public String nom;
		public double prix;
	
	// Constructeurs
		
		public Pizza(int id, String code, String nom, double prix) {
			super();
			this.id = id;
			this.code = code;
			this.nom = nom;
			this.prix = prix;
		}
	
	// Accesseurs 
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
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
		



}
