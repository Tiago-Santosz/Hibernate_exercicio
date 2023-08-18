package br.com.cursopcv.test;

import br.com.cursopcv.repository.RepositoryEstoque;


public class InclusaoDeProduto {

	public static void main(String[] args) {
		RepositoryEstoque newProp = new RepositoryEstoque();
		
		newProp.addProduto("Panela", "Panela de pressao 10L", 56.80 );
		newProp.addProduto("Cama", "Cama de casal Big", 450.68);
		newProp.addProduto("Caixa", "Caixa som JBL", 160.00);
		
		newProp.fecharConexao();
		

	}

	

}
