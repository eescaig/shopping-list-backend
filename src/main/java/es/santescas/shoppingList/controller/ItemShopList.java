package es.santescas.shoppingList.controller;


/**
 * Clase que contiene la estructura de las listas de compras.
 * @author Eyleen María Escaig
 *
 */
public class ItemShopList {
	
	private ShopItemDto item;
	private Integer amount;
	
	public ItemShopList() {
		
	}
	
	public ItemShopList(ShopItemDto item, Integer amount) {
		this.item = item;
		this.amount =  amount;
	}
	
	@Override
	public String toString() {
		return "ItemShopList [item=" + item + ", amount=" + amount + "]";
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
