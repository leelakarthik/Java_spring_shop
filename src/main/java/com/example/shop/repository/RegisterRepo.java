package com.example.shop.repository;

import com.example.shop.bean.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<Customer, Long>{

}

