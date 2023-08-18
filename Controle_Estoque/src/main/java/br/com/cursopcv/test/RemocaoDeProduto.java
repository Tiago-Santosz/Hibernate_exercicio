package br.com.cursopcv.test;

import br.com.cursopcv.repository.RepositoryEstoque;

public class RemocaoDeProduto {

	public static void main(String[] args) {

		RepositoryEstoque removeProd = new RepositoryEstoque();

		removeProd.removerProduto(4);

		System.out.println("Produto removido!");

	}

}
