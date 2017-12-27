package es.santescas.shoppingList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.santescas.shoppingList.repository.ItemsListRepositoryMongoDb;


@RestController
@EnableAutoConfiguration
public class ShoppingItemController {
	
	private static final String SHOP_ITEM = "shopItem";
	
	@Autowired
	private ItemsListRepositoryMongoDb repository;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET,path=SHOP_ITEM)
    public List<ShopItemDto> getShopItems() {
		
        return repository.findAll();
    }
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,path=SHOP_ITEM)
	public ShopItemDto setShopItems(@RequestBody ShopItemDto shopItem) {
		
		return repository.insert(shopItem);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE,path=SHOP_ITEM+"/{name}")
	public void removeShopItem(@PathVariable(value="name") String shopItemName) {
		
		repository.delete(shopItemName);
	}
}
