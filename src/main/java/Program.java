import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Marca;
import entities.Modelo;
import entities.Automovel;


public class Program {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("concessionaria");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Modelo m1 = new Modelo(23, "Gol", 1);
		Automovel a1 = new Automovel(01, 2014, 2010, "Carro Completo", (float) 30000 , 0, m1);
		Marca marca1 = new Marca(26, "Volkswagem");
	
		m1.addAuto(a1);
		marca1.addModelo(m1);
		
		
		em.persist(m1);
		em.persist(a1);
		em.persist(marca1);
		
		em.getTransaction().commit();
		
		Automovel a = em.find(Automovel.class, marca1);
		
		System.out.println("\n *** Automovel: " + a.getObservacoes() + "|"  + a.getAnoFabricacao() + "|" + a.getModelo());
		
		

	}
}



