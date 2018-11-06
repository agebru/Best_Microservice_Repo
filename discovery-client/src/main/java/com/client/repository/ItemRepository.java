package com.client.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.client.model.Item;
import com.client.model.Provider;

public class ItemRepository {
private static List<Item> items=new ArrayList<>();

static {
	
	
	items.add(new Item(101,"Laptop",350.0,new ArrayList<Provider>(){{
		add(new Provider(10001,"Dell"));
		add(new Provider(10001,"Toshiba"));
	}}));
	
	items.add(new Item(102,"Mobile",200.0,new ArrayList<Provider>(){{
		add(new Provider(10001,"Huwawei"));
		add(new Provider(10001,"Samsung"));
		add(new Provider(10001,"Iphone"));
	}}));
	
	items.add(new Item(103,"Car",35000.0,new ArrayList<Provider>(){{
			add(new Provider(10001,"Toyota"));
			add(new Provider(10001,"Corolla"));
			
}}));
	items.add(new Item(104,"Chair",130.00,new ArrayList<Provider>(){{
				add(new Provider(10001,"3F furnitures"));
						
	}}));
}


public static List<Item> getAllItems(){
	return items;
}

public static Item getItemById(int itemId) {
	Optional<Item> item=items.stream().filter(itm->itm.getItemId()==itemId).findFirst();
	if(item.isPresent()) {
		return item.get();
	}
	else
		return Optional.of(new Item(0,"Item_NOT_Found",0.00,null)).get();
}

public static List<Provider> getProvidersForItem(int itemId){
	List<Provider> providers=new ArrayList<>();
	for(Item item:items) {
		if(item.getItemId()==itemId) {
			providers.addAll(item.getProviders());
		}
	}
	return providers;
}


}
