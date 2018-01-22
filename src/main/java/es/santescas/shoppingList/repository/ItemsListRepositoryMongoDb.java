package es.santescas.shoppingList.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import es.santescas.shoppingList.controller.ShopItemDto;

@Repository
public interface ItemsListRepositoryMongoDb extends MongoRepository<ShopItemDto, String> {

}
