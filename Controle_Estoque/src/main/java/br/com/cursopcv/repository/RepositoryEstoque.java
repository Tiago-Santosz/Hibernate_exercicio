package br.com.cursopcv.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursopcv.modelo.Produto;

public class RepositoryEstoque extends Produto {

	private EntityManagerFactory emf;
	private EntityManager em;

	public RepositoryEstoque() {
		emf = Persistence.createEntityManagerFactory("controleestoque");
		em = emf.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return em;
	}

	public void alterarProduto(Integer cod, double preco) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Produto prod = em.find(Produto.class, cod);
		prod.setPreco(preco);
		prod = em.merge(prod);
		em.getTransaction().commit();
	}

	public void addProduto(String nome, String descricao, double preco) {

		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Produto newProp = new Produto(nome, descricao, preco);
			em.persist(newProp);
			em.getTransaction().commit();
			System.out.println("Produtos adicionados!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Produto> listaProdutos() {
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			List<Produto> prod = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();

			for (Produto p : prod) {
				System.out.println(p.getName() + " , " + p.getDescricao() + " , " + p.getPreco());
			}
			em.getTransaction().commit();
			return prod;
		} finally {
			fecharConexao();
		}
	}

	public void removerProduto(Integer cod) {
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Produto prod = em.find(Produto.class, cod);
			em.remove(prod);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fecharConexao() {
		em.close();
		emf.close();
	}

}
