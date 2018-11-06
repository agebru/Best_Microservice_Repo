package com.client.model;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private int itemId;
	private String itemName;
	private List<Provider> providers=new ArrayList<>();
	private double price;

	public Item() {

	}

	public Item(int itemId, String itemName, double price,List<Provider> providers) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.providers=providers;
	}
	
	public void addProvider(Provider provider) {
		if(providers!=null) {
			providers.add(provider);
		}
		else {
			providers=new ArrayList<>();
			providers.add(provider);
		}
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}

}
