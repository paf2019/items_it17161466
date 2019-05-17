package com.it17161466.items.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.it17161466.items.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
