package es.santescas.shoppingList.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.santescas.shoppingList.controller.ShopItemDto;

public interface ItemsListRepositoryMongoDb extends MongoRepository<ShopItemDto, String> {

}
