package com.amazon.WebECommerce.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.amazon.WebECommerce.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserDao extends CrudRepository<User, Long> {
    List<User> findByNome(String name);
    List<User> findByEmail(String email);
    List<User> findByUsername(String username);
    List<User> findByPassword(String password);
    User findById(long id);
    
    //@Query("select s from Utenti s where username= :username and password = :password")
	//public User login(String username, String password);
}
