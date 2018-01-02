
package fr.pizzeria.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Pizza {
	
	// Attributs

//		private static int crId;
		public String code;
		public String nom;
		public double prix;
		public CategoriePizza categorie;
	
	// Constructeurs
		
		public Pizza(String code, String nom, double prix, CategoriePizza categorie) {
			super();
//			this.crId= crId;
			this.code = code;
			this.nom = nom;
			this.prix = prix;
			this.categorie=categorie;
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

		
		private static final Logger LOG = LoggerFactory.getLogger("dev.console");
		
	// Fonction permettant d'afficher les pizzas
		
		public void affiche(){
			
			LOG.info( code + " -> " + nom + "(" + prix + " €) " + categorie);
		}


}
