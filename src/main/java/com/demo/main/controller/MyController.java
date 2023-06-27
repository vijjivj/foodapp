package com.demo.main.controller;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
            // You can handle the exception or return an appropriate response here
        }
        return cart;
    }

    @DeleteMapping("/deleteCart")
    public void deleteCart(@RequestBody Cart cart) throws Exception {
        try {
            logger.info("Deleting cart: {}", cart);
            cartService.deleteCart(cart);
            logger.info("Cart deleted successfully");
        } catch (Exception e) {
            logger.error("Error occurred while deleting cart", e);
            // You can handle the exception or return an appropriate response here
           e.printStackTrace();
        }
        
    }

    @PutMapping("/updateCart")
    public Cart updateCart(@RequestBody Cart cart) throws Exception {
        try {
            logger.info("Updating cart: {}", cart);
            return cartService.updateCart(cart);
        } catch (Exception e) {
            logger.error("Error occurred while updating cart", e);
            // You can handle the exception or return an appropriate response here
        }
        return cart;
    }


}
    
    
    
    
    
    
    
    




























//@GetMapping("/totalPrice")
//public List<Cart> gettotalPrice() {
//  try {
//      logger.info("Fetching total price for all carts");
//      return cartService.getTotalPrice();
//  } catch (Exception e) {
//      logger.error("Error occurred while fetching total price", e);
//      // You can handle the exception or return an appropriate response here
//  }
//  return Collections.emptyList();
//}
    
    

