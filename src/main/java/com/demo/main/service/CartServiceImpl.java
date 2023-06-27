package com.demo.main.service;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//
//import org.springframework.stereotype.Service;
//
//import com.demo.main.entity.Cart;
//import com.demo.main.exception.NumberFormatingException;
//import com.demo.main.repository.Repository;
//
//@Service
//public class CartServiceImpl implements CartService {
//
//	@Autowired
//	Repository cartRepository;
//	
//	
//	@Override
//	public Cart addCart(Cart cart) throws Exception {
//		return cartRepository.save(cart);
//	}
//	@Override
//	public void deleteCart(Cart cart) throws Exception {
//	    cartRepository.delete(cart);
//	}
//
//
//	 
//
//
//	public Cart updateCart(Cart cart) throws Exception {
//        
//        try {
//        } catch (Exception e) {
//            throw new Exception("Failed to update cart", e);
//        
//	
//	}
//		return cartRepository.save(cart);
//	}
//	@Override
//	public List<Cart> getTotalPrice() throws NumberFormatingException {
//		try {
//
//            List<Cart>totalPrice=cartRepository.findAll();
//
//        } catch (Exception e) {
//
//
//            e.printStackTrace();
//
//        }
//
//        return getTotalPrice();
//
//        }
//}
//
//
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.entity.Cart;
import com.demo.main.exception.NumberFormatingException;
import com.demo.main.repository.Repository;

@Service
public class CartServiceImpl implements CartService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CartServiceImpl.class);

    @Autowired
    Repository cartRepository;

    @Override
    public Cart addCart(Cart cart) throws Exception {
        LOGGER.info("Adding cart: {}", cart);

        try {
            return cartRepository.save(cart);
        } catch (Exception e) {
            LOGGER.error("Failed to add cart", e);
            throw new Exception("Failed to add cart", e);
        }
    }

    @Override
    public void deleteCart(Cart cart) throws Exception {
        LOGGER.info("Deleting cart: {}", cart);

        try {
            cartRepository.delete(cart);
        } catch (Exception e) {
            LOGGER.error("Failed to delete cart", e);
            throw new Exception("Failed to delete cart", e);
        }
    }

   

    @Override
    	public List<Cart> getTotalPrice() throws NumberFormatingException {
	try {

		List<Cart>totalPrice=cartRepository.findAll();

        } catch (Exception e) {


            e.printStackTrace();

        }

        return getTotalPrice();

        }

	public Cart updateCart(Cart cart) throws Exception {
      
      try {
      } catch (Exception e) {
          throw new Exception("Failed to update cart", e);
      

	}
		return cartRepository.save(cart);
	}
}

 