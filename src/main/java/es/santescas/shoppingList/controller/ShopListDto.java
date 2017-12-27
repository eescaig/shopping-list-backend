package es.santescas.shoppingList.controller;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase listas de compras. Contiene el nombre de la lista y el listado de items - cantidad.
 * @author Eyleen María Escaig
 *
 */
@Document(collection="shopList")
public class ShopListDto {
	
	@Id
	private String nameList;
	private List<ItemShopList> list;

	public ShopListDto() {
		super();
	}
		
	public ShopListDto(String nameList, List<ItemShopList> list) {
		super();
		this.nameList = nameList;
		this.list = list;
	}

	public String getNameList() {
		return nameList;
	}

	public void setNameList(String nameList) {
		this.nameList = nameList;
	}
	
	public List<ItemShopList> getList() {
		return list;
	}

	public void setList(List<ItemShopList> list) {
		this.list = list;
	}

}
