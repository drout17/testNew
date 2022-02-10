package com.LearnTesting.UnitTesting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnTesting.UnitTesting.Entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
