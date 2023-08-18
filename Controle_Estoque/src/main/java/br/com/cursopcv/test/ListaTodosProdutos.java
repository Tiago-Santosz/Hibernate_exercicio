package br.com.cursopcv.test;

import br.com.cursopcv.repository.RepositoryEstoque;

public class ListaTodosProdutos {

	public static void main(String[] args) {

		RepositoryEstoque prodList = new RepositoryEstoque();

		System.out.println("---Lista de Produtos---");

		prodList.listaProdutos();

	}

}
