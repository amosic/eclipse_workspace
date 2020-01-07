package com.amazon.WebECommerce.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amazon.WebECommerce.model.Brand;
import com.amazon.WebECommerce.model.Product;
import com.amazon.WebECommerce.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface ProductDao extends CrudRepository<Product, Integer> {
    List<Product> findByNome(String nome);
    List<Product> findByMarca(Brand marca);
    Product findById(int id);
}
