package es.santescas.shoppingList.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import es.santescas.shoppingList.controller.ShopItemDto;

@Repository
@EnableAutoConfiguration
public class ShopItemRepositoryInMemory implements ShopItemsRepository{
	
	private List<ShopItemDto> items;
	
	public ShopItemRepositoryInMemory(){
		items = new ArrayList<>();
		ShopItemDto itemLeche=new ShopItemDto("leche", 6);
		ShopItemDto itemCerveza=new ShopItemDto("cerveza",12);
		ShopItemDto itemHuevos=new ShopItemDto("cerveza",24);
		
		
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
	

}
