package fr.pizzeria.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.pizzeria.model.Pizza;




public class PizzaDaoJdbc implements IPizzaDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_pizza");
	EntityManager em = entityManagerFactory.createEntityManager();

	public PizzaDaoJdbc() {

	}

	public List<Pizza> findAllPizzas() {

		List<Pizza> pizzas = new ArrayList();

		TypedQuery<Pizza> query = em.createQuery("from Pizza", Pizza.class);

		for (Pizza p : query.getResultList()) {

			pizzas.add(p);

		}

		return pizzas;

	}

	public boolean updatePizza(String choixCode, Pizza pizza) {

			TypedQuery<Pizza> query = em.createQuery("from Pizza WHERE code=:target", Pizza.class);
			query.setParameter("target", choixCode);
			Pizza p = query.getResultList().get(0);
			EntityTransaction et = em.getTransaction(); 
			et.begin();
			
			p.setNom(pizza.getNom());
			p.setPrix(pizza.getPrix());
			p.setCat(pizza.getCat());
			p.setCode(pizza.getCode());
			
			et.commit();

		
	
		return false;
	}

	public boolean saveNewPizza(Pizza pizza) throws SavePizzaException {
		
		EntityTransaction et = em.getTransaction(); 
		et.begin();
		em.persist(pizza);
		et.commit();
		
		return false;
	}

	public boolean deletePizza(String choixCode) {

		TypedQuery<Pizza> query = em.createQuery("from Pizza WHERE code=:target", Pizza.class);
		query.setParameter("target", choixCode);
		Pizza p = query.getResultList().get(0);
		EntityTransaction et = em.getTransaction(); 
		et.begin();
		
		em.remove(p);
		
		et.commit();
		return false;
	}

}
