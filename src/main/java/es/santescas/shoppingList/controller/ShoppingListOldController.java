package es.santescas.shoppingList.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.santescas.shoppingList.repository.ShopItemsRepository;

@RestController
public class ShoppingListOldController {

	@Autowired
	private ShopItemsRepository repository;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET,path="shopItemOld")
    public List<ShopItemDto> getShopItems() {
		
        return repository.getShopItems();
    }
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,path="shopItemOld")
	public ShopItemDto setShopItems(@RequestBody ShopItemDto shopItem) {
		
		return repository.addShopItem(shopItem);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE,path="shopItemOld/{shopItemIndex}")
	public Boolean removeShopItem(@PathVariable Integer shopItemIndex) {
		
		return repository.removeShopItem(shopItemIndex);
	}
}
