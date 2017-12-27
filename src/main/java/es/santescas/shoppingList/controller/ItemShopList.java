package es.santescas.shoppingList.controller;

import org.springframework.data.annotation.Id;

/**
 * Clase que contiene la estructura de las listas de compras.
 * @author Eyleen María Escaig
 *
 */
public class ItemShopList {
	
	private ShopItemDto item;
	private Integer amount;
	
	public ItemShopList() {
		super();
	}
		
	public ItemShopList(ShopItemDto item, Integer amount) {
		super();
		this.item = item;
		this.amount =  amount;
	}
	
	public ShopItemDto getItem() {
		return item;
	}
	public void setItem(ShopItemDto item) {
		this.item = item;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
