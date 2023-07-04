package com.demo.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int cartId;
	private String itemName;
	private int unitPrice;
	private float totalPrice;
	private int quantity;

	public Cart() {
		super();
	}

	public Cart(int cartId, String iteamName, int unitPrice, float totaPrice) {
		super();
		this.cartId = cartId;
		this.itemName = iteamName;
		this.unitPrice = unitPrice;
		this.totalPrice = totaPrice;
//		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {

		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", totalPrice="
				+ totalPrice + ", quantity=" + quantity + "]";
	}

}
