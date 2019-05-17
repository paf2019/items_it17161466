package com.it17161466.items.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
}
