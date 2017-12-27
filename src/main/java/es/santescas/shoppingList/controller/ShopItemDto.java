package es.santescas.shoppingList.controller;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class ShopItemDto {
	
	@Id
	private String name;

	public ShopItemDto() {
		super();
	}
	
	public ShopItemDto(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
