package com.amazon.WebECommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Prodotti")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(min=4, max=15)
	String nome;

    @NotNull
    @OneToOne
    private Brand marca;
    
    @NotNull
    @Size(min=4, max=15)
    String imageUrl;
    
    @NotNull
    @DecimalMax("1000.0")
    @DecimalMin("0.0")
    double prezzo;

	public Product() {
	}
	
	public Product(String nome, Brand marca, double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Brand getMarca() {
		return marca;
	}

	public void setMarca(Brand marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
