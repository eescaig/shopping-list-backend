package es.santescas.shoppingList.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.santescas.shoppingList.repository.ItemsListRepositoryMongoDb;


@RestController
@RequestMapping(path="api/shopItem")
public class ShoppingItemController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingItemController.class);

	@Autowired
	private ItemsListRepositoryMongoDb repository;
	
	@RequestMapping(method=RequestMethod.GET)
    public List<ShopItemDto> getShopItems() {
		
        return repository.findAll();
    }
	
	@RequestMapping(method=RequestMethod.POST)
	public ShopItemDto setShopItems(@RequestBody ShopItemDto shopItem) {

		ShopItemDto newItem = repository.insert(shopItem);
		if (newItem != null) {
			LOGGER.info("Se ha insertado el item: " + newItem.toString());
		}
		
		return newItem;
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/{name}")
	public void removeShopItem(@PathVariable(value="name") String shopItemName) {
		
		repository.delete(shopItemName);
	}
}
