package com.demo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.demo.main.entity.Cart;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Cart,Integer>  {
	

}
