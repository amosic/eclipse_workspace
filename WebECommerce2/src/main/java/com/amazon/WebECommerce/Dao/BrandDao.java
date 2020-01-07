package com.amazon.WebECommerce.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amazon.WebECommerce.model.Brand;


public interface BrandDao extends CrudRepository<Brand, Integer> {
    List<Brand> findByNome(String nome);
    Brand findById(int id);
}