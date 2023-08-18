package br.com.cursopcv.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Integer cod;
	
	@Column
	private String name;
    
    @Column
	private String descricao;
    
    @Column
	private double preco;

    
	public Produto() {
		
	}

	public Produto(String name, String descricao, double preco) {

		this.name = name;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
  
}
