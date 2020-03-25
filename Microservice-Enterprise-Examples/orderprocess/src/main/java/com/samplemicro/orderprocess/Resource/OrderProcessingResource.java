package com.samplemicro.orderprocess.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samplemicro.orderprocess.model.Item;
import com.samplemicro.orderprocess.model.Order;
import com.samplemicro.orderprocess.model.PaymentMethod;

@RestController
@RequestMapping("/order")
public class OrderProcessingResource {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> getOrder(@PathVariable("id") String id){
		
		Item item1 = new Item("101", 1);
		Item item2 = new Item("102", 2);
		PaymentMethod paymentMethod = new PaymentMethod("CREDIT", "01/22", "John Doe", "Airoli,Navi Mumbai");
		Order order = new Order("10102", id, paymentMethod, new Item[] {item1,item2}, "Airoli,Navi Mumbai");
		return ResponseEntity.ok(order);
	}
	

}
