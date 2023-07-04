package com.demo.main.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import com.demo.main.entity.Cart;
import com.demo.main.service.CartService;

@RestController
@CrossOrigin()
@RequestMapping("/mycart")
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(MyController.class);

	@Autowired
	private CartService cartService;

	@PostMapping("/addCart")
	public Cart addCart(@RequestBody Cart cart) {
		try {
			logger.info("Adding cart: {}", cart);
			return cartService.addCart(cart);
		} catch (Exception e) {
			logger.error("Error occurred while adding cart", e);
		}
		return cart;
	}

	@DeleteMapping("/deleteCart")
	public void deleteCart(@RequestBody Cart cart) {//throws InvalidCartName {
		try {
			logger.info("Deleting cart: {}", cart);
			cartService.deleteCart(cart);
			logger.info("Cart deleted successfully");
		} catch (Exception e) {
			logger.error("Error occurred while deleting cart", e);
			e.printStackTrace();
		}
	}

	@PutMapping("/updateCart")
	public Cart updateCart(@RequestBody Cart cart) { //throws InvalidCartName {
		try {
			//logger.info("Updating cart: {}", cart);
			return cartService.updateCart(cart);
		} catch (Exception e) {
			//logger.error("Error occurred while updating cart", e);
		}
		return cart;
	}
}
