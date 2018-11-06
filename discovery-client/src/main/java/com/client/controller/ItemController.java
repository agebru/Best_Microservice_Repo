package com.client.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.model.Item;
import com.client.model.Provider;
import com.client.repository.ItemRepository;

@RestController
public class ItemController {
	
	@GetMapping("/items")
	public List<Item> allItems(){
		return ItemRepository.getAllItems();
	}
	
	
	@GetMapping("/items/{itemId}")
	public Item getItem(@PathVariable("itemId") int itemId){
		return ItemRepository.getItemById(itemId);
	}
	
	@GetMapping("/items/providers/{itemId}")
	public List<Provider> getProvidersForItem(@PathVariable("itemId") int itemId){
		return ItemRepository.getProvidersForItem(itemId);
	}

}
