package com.it17161466.items.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it17161466.items.model.Items;
import com.it17161466.items.repository.ItemsRepository;


@Service
public class ItemsManagementService {

	@Autowired
	private ItemsRepository itemsRepository;

	public Items createItem(Items item) {
		
		return itemsRepository.save(item);
	}

	public Optional<Items> getItemById(Integer itemId) {
		return itemsRepository.findById(itemId);
	}

	public void deleteItem(Integer itemId) {
		itemsRepository.deleteById(itemId);
		
	}

	public Items updateItemPrice(Integer itemId, double nprice) {
		Items itemsFromDB = itemsRepository.findById(itemId).get();
		itemsFromDB.setItem_price(nprice);
		Items updatedItems = itemsRepository.save(itemsFromDB);
		return updatedItems;
	}

	public Iterable<Items> getAllItems() {
		
		return itemsRepository.findAll();
	}
	
}
