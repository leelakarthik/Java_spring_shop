package com.example.shop.repository;

import com.example.shop.bean.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);
}