package br.com.cursopcv.test;

import br.com.cursopcv.repository.RepositoryEstoque;

public class AlteracaoDeProduto {

	public static void main(String[] args) {

		RepositoryEstoque repEst = new RepositoryEstoque();
		repEst.alterarProduto(2, 345.40);

		System.out.println("Alteracao realizada!");
		repEst.fecharConexao();

	}

	

}
