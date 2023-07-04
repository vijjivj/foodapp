package com.demo.main.service;
	import static org.junit.jupiter.api.Assertions.*;

	import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.springframework.boot.test.context.SpringBootTest;

	import com.demo.main.entity.Cart;
import com.demo.main.exception.InvalidCartName;
import com.demo.main.repository.Repository;

	@SpringBootTest
	 class ServiceImplTest {

	    @Mock
	    private Repository cartRepository;

	    @InjectMocks
	    private CartServiceImpl cartService;

	    @Test
	    void testAddCart() throws Exception {
	        
	        Cart p = new Cart(1,"Test",150,12.01f);
	        when(cartRepository.save(p)).thenReturn(p);

	        Cart result = cartService.addCart(p);

	        assertNotNull(result);
	        assertEquals(p, result);
	        verify(cartRepository, times(1)).save(p);
	    }

	    @Test
	    void testUpdateCart() throws Exception {
	        Cart p = new Cart(1,"Test",150,12.01f);

	        when(cartRepository.save(p)).thenReturn(p);

	        Cart result = cartService.updateCart(p);

	        assertNotNull(result);
	        assertEquals(p, result);
	        verify(cartRepository, times(1)).save(p);
	    }

	    @Test
	    void testDeleteCart() throws Exception {
	        Cart p = new Cart(1,"Test",150,12.01f);

	        assertDoesNotThrow(() -> cartService.deleteCart(p));

	       verify(cartRepository, times(1)).delete(p);
	    }

	  @Test
	     void testGetTotalPrice() throws Exception {
	    
		  Cart cart = new Cart(1, "Test", 150, 12.01f);
		    when(cartRepository.save(cart)).thenReturn(cart);

		    Cart result = cartService.updateCart(cart);

		    assertNotNull(result);
		    assertEquals(cart, result);
		    verify(cartRepository, times(1)).save(cart);
		}
	}

