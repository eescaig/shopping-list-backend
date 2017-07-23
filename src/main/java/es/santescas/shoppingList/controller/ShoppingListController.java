package es.santescas.shoppingList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.santescas.shoppingList.repository.ShopItemsRepository;

@RestController
@EnableAutoConfiguration
public class ShoppingListController {

	@Autowired
	private ShopItemsRepository repository;
	
	@RequestMapping(method=RequestMethod.GET,path="shopItem")
    public List<ShopItemDto> getShopItems() {
		
        return repository.getShopItems();
    }
	
	@RequestMapping(method=RequestMethod.POST,path="shopItem")
	public ShopItemDto setShopItems(@RequestBody ShopItemDto shopItem) {
		
		return repository.addShopItem(shopItem);
	}
}
