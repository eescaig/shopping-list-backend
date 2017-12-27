package es.santescas.shoppingList.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.santescas.shoppingList.controller.ShopItemDto;
import es.santescas.shoppingList.controller.ShopListDto;

public interface ShoppingListRepositoryMongoDb extends MongoRepository<ShopListDto, String> {
	
}
