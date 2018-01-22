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

import es.santescas.shoppingList.repository.ShoppingListRepositoryMongoDb;

@RestController
@RequestMapping(path="api/shoppingList")
public class ShoppingListController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingListController.class);

	@Autowired
	private ShoppingListRepositoryMongoDb repository;
	
	@RequestMapping(method=RequestMethod.GET)
    public List<ShopListDto> getShoppingList() {
		
        return repository.findAll();
    }
	
	@RequestMapping(method=RequestMethod.POST)
	public ShopListDto setShoppingList(@RequestBody ShopListDto shoppingList) {
		
		ShopListDto newList = repository.insert(shoppingList);
		if (newList != null) {
			LOGGER.info("Se ha insertado la lista: " + newList.toString());
		}

		return newList;
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/{nameList}")
	public void removeShoppingList(@PathVariable(value = "nameList") String idList) {
		
		repository.delete(idList);
	}

}
