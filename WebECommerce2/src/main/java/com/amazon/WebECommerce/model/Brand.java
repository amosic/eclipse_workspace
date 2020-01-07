package com.amazon.WebECommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Marca")
public class Brand {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(min=4, max=15)
    private String nome;
    
	public Brand() {
	}

	public Brand(Integer id, String name) {
		super();
		this.id = id;
		this.nome = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + nome + "]";
	}
}
