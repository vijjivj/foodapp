package com.demo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.entity.Cart;

public interface Repository extends JpaRepository<Cart,Integer>  {
	

}
