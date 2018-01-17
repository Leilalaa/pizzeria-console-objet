
package fr.pizzeria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity
@Table(name="PIZZA")
public class Pizza {
	
	// Attributs

//		private static int crId;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int id;
		@Column(name = "CODE")
		public String code;
		@Column(name = "PIZZA_NAME")
		public String nom;
		@Column(name = "PRICE")
		public double prix;
		@Column(name = "CATEGORY")
		@Enumerated(EnumType.STRING)
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
		public CategoriePizza getCat(){
			return categorie;
		}
		public void setCat(CategoriePizza categorie) {
			this.categorie=categorie;
		}

		
		private static final Logger LOG = LoggerFactory.getLogger("dev.console");
		
	// Fonction permettant d'afficher les pizzas
		
		public void affiche(){
			
			LOG.info( code + " -> " + nom + "(" + prix + " €) " + categorie);
		}


}
