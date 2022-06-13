package br.com.alura.loja.testes;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
						
		EntityManager em = JPAUtil.getEntityManger();				
		em.getTransaction().begin();
		
		em.persist(celulares);
		celulares.setNome("XPTO");
				
		em.getTransaction().commit();
		em.close();
		celulares.setNome("1234");
	}
}
