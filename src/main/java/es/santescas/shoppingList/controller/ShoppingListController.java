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

import es.santescas.shoppingList.repository.ShoppingListRepositoryMongoDb;

@RestController
@EnableAutoConfiguration
public class ShoppingListController {
	
	private static final String SHOP_LIST = "shopList";
	
	@Autowired
	private ShoppingListRepositoryMongoDb repository;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET,path=SHOP_LIST)
    public List<ShopListDto> getShoppingList() {
		
        return repository.findAll();
    }
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,path=SHOP_LIST)
	public ShopListDto setShoppingList(@RequestBody ShopListDto shoppingList) {
		
		return repository.insert(shoppingList);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE,path=SHOP_LIST+"/{nameList}")
	public void removeShopItem(@PathVariable(value="nameList") String nameList) {
		
		repository.delete(nameList);
	}

}
