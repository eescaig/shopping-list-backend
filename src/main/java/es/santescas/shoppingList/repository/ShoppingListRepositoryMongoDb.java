package es.santescas.shoppingList.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import es.santescas.shoppingList.controller.ShopListDto;

@Repository
public interface ShoppingListRepositoryMongoDb extends MongoRepository<ShopListDto, String> {
	
}
