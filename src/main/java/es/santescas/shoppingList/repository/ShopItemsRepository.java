package es.santescas.shoppingList.repository;

import java.util.List;

import es.santescas.shoppingList.controller.ShopItemDto;

public interface ShopItemsRepository {
	
	List<ShopItemDto> getShopItems();
	
	ShopItemDto addShopItem(ShopItemDto shopItem);
	
	boolean removeShopItem(int shopItemIndex);
}
