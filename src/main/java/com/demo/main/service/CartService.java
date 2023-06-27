package com.demo.main.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Cart;
@Service
public interface CartService {
	
	public Cart addCart(Cart cart)throws Exception ;
	
		
	public Cart updateCart ( Cart cart ) throws Exception;
	
		
	public void deleteCart(Cart cart) throws Exception;
	
	public List<Cart> getTotalPrice()throws Exception;
	

}