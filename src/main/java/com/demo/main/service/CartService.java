package com.demo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Cart;
import com.demo.main.exception.InvalidCartName;

@Service
public interface CartService {

	public Cart addCart(Cart cart) throws InvalidCartName;

	public Cart updateCart(Cart cart) throws InvalidCartName;

	public void deleteCart(Cart cart) throws InvalidCartName;

	public List<Cart> getTotalPrice() throws InvalidCartName;

}