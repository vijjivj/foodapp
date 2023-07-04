package com.demo.main.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.main.entity.Cart;
import com.demo.main.exception.InvalidCartName;
import com.demo.main.exception.NumberFormatingException;
import com.demo.main.repository.Repository;

@Service
public class CartServiceImpl implements CartService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CartServiceImpl.class);

	@Autowired
	Repository cartRepository;

	@Override
	public Cart addCart(Cart cart) throws InvalidCartName {
		LOGGER.info("Adding cart: {}", cart);

		try {
			return cartRepository.save(cart);
		} catch (Exception e) {
			LOGGER.error("Failed to add cart", e);
			throw new InvalidCartName("Failed to add cart");
		}
	}

	@Override
	public void deleteCart(Cart cart) throws InvalidCartName {
		LOGGER.info("Deleting cart: {}", cart);

		try {
			cartRepository.delete(cart);
		} catch (Exception e) {
			LOGGER.error("Failed to delete cart", e);
			throw new InvalidCartName("Failed to delete cart");
		}
	}

	@Override
	public List<Cart> getTotalPrice() throws InvalidCartName {
		try {

			List<Cart> totalPrice = cartRepository.findAll();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return getTotalPrice();
	}

	public Cart updateCart(Cart cart) throws InvalidCartName {

		try {
		} catch (Exception e) {
			throw new InvalidCartName("Failed to update cart");

		}
		return cartRepository.save(cart);
	}
}
