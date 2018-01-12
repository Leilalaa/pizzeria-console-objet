package fr.pizzeria.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

import java.util.ResourceBundle;


public class PizzaDaoJdbc implements IPizzaDao {

	ResourceBundle props = ResourceBundle.getBundle("jdbc");
	//String driverName = props.getString("jdbc.driverClassName");

	String url = props.getString("db.url");
	String utilisateur = props.getString("db.username");
	String motDePasse = props.getString("db.password");
	Connection connection = null;

	public PizzaDaoJdbc() {

		try {

			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(url, utilisateur, motDePasse);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Pizza> findAllPizzas() {

		ArrayList<Pizza> pizzas = new ArrayList();
		
		try {
		Statement statement = connection.createStatement();

		ResultSet resultats = statement.executeQuery("SELECT * FROM pizza");

		while (resultats.next()) {

			String code = resultats.getString("id");
			String nom = resultats.getString("pizza_name");
			Double prix = resultats.getDouble("price");
			String categorieStr = resultats.getString("category").toUpperCase();
			CategoriePizza categorie = CategoriePizza.valueOf(categorieStr);
			
			Pizza p = new Pizza(code, nom, prix, categorie);
			pizzas.add(p);
			
			
		}
		statement.close();
		resultats.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pizzas;


	}

	public boolean updatePizza(String choixCode, Pizza pizza) {
		
		try {
			
		PreparedStatement updatePizzaSt = connection.prepareStatement("UPDATE PIZZA SET ID=?, PIZZA_NAME=?, PRICE=?, CATEGORY=? WHERE ID=?"); 
		
		updatePizzaSt.setString(1,pizza.getCode()); 
		updatePizzaSt.setString(2,pizza.getNom()); 
		updatePizzaSt.setDouble(3,pizza.getPrix());
		updatePizzaSt.setString(4,pizza.getCat().toString());
		updatePizzaSt.setString(5,choixCode);
		updatePizzaSt.executeUpdate();
		updatePizzaSt.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean saveNewPizza(Pizza pizza) throws SavePizzaException {

		PreparedStatement savePizzaSt;
		try {
			
			savePizzaSt = connection.prepareStatement("INSERT INTO PIZZA VALUES(?,?,?,?)"); 
			
			savePizzaSt.setString(1,pizza.getCode()); 
			savePizzaSt.setString(2,pizza.getNom()); 
			savePizzaSt.setDouble(3,pizza.getPrix());
			savePizzaSt.setString(4,pizza.getCat().toString());
			savePizzaSt.executeUpdate();
			savePizzaSt.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
	}

	public boolean deletePizza(String choixCode) {
		
		try {
			PreparedStatement deletePizzaSt = connection.prepareStatement("DELETE FROM PIZZA WHERE ID=?"); 
			
			deletePizzaSt.setString(1,choixCode);  
			deletePizzaSt.executeUpdate();
			deletePizzaSt.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
	}

}
