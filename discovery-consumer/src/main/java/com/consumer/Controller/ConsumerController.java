package com.consumer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumer.model.Item;
import com.consumer.model.Student;



@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String home() {
		return "pinging: "+env.getProperty("local.server.port");
	}
	
	@GetMapping("/all-orders")
	public List<Order> allOrders(){
       List<Order> orders= restTemplate.getForObject("http://client-app/orders/", List.class);
       
       return orders;
	}
	
	
	
	
	// fetching students
	@GetMapping("/all-students")
	public List<Student> allStudents(){
       List<Student> orders= restTemplate.getForObject("http://client-app/students/", List.class);
       
       return orders;
	}
	
	
	
	
	@GetMapping("/all-orders/{orderId}")
	public Order OneOrder(@PathVariable("orderId") int orderId){
      Order order=restTemplate.getForObject("http://client-app/orders/{orderId}", Order.class,orderId);
       
       return order;
	}
	
	// getting all Items
	@GetMapping("/all-items")
	public List<Item> getItems(){
       List<Item> items= restTemplate.getForObject("http://client-app/items/", List.class);
       
       return items;
	}
	
	@GetMapping("/all-items/{itemId}")
	public Item getItemById(@PathVariable("itemId") int itemId){
       Item item= restTemplate.getForObject("http://client-app/items/{itemId}", Item.class,itemId);
       
       return item;
	}


}
