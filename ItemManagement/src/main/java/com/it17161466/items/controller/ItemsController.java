package com.it17161466.items.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it17161466.items.model.Items;
import com.it17161466.items.service.ItemsManagementService;

@RestController
@RequestMapping(value="/api/items")
public class ItemsController {

	@Autowired
	private ItemsManagementService itemsManagementService;
	
	@PostMapping(value="/create")
	public Items createItem(@RequestBody Items item) {
		return itemsManagementService.createItem(item);
	}
	
	@GetMapping(value="/item/{itemId}")
	public Optional<Items> getSupplierById(@PathVariable("itemId") Integer itemId) {
		return itemsManagementService.getItemById(itemId);
	}
	
	@DeleteMapping(value="/item/{itemId}")
	public void deleteItem(@PathVariable("itemId") Integer itemId) {
		itemsManagementService.deleteItem(itemId);
	}
	
	@PutMapping(value="/item/{itemId}/{nprice}")
	public Items updateItemPrice(@PathVariable("itemId") Integer itemId, @PathVariable("nprice") double nprice) {
		return itemsManagementService.updateItemPrice(itemId,nprice);
	}
	
	@GetMapping(value="/item/allitems")
	public Iterable<Items> getAllItems(){
		
		return itemsManagementService.getAllItems();
	}
}
