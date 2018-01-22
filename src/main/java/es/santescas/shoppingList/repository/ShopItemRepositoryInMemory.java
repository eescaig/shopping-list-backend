package es.santescas.shoppingList.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import es.santescas.shoppingList.controller.ShopItemDto;

@Repository
public class ShopItemRepositoryInMemory implements ShopItemsRepository {
	
	private List<ShopItemDto> items;
	
	public ShopItemRepositoryInMemory() {
		items = new ArrayList<>();
		ShopItemDto itemLeche=new ShopItemDto("leche");
		ShopItemDto itemCerveza=new ShopItemDto("cerveza");
		ShopItemDto itemHuevos=new ShopItemDto("cerveza");
		
		
		items.add(itemLeche);
		items.add(itemCerveza);
		items.add(itemHuevos);
	}

	@Override
	public List<ShopItemDto> getShopItems() {
		return items;
	}

	@Override
	public ShopItemDto addShopItem(ShopItemDto shopItem) {
		items.add(shopItem);
		return shopItem;
	}
	
	@Override
	public boolean removeShopItem(int shopItemIndex) {
		ShopItemDto itemDeleted = null;
		boolean deletedOk = false;
		try {
			itemDeleted = items.remove(shopItemIndex);
			if(itemDeleted!=null) {
				deletedOk = true;
			}
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		return deletedOk;
	}

}
