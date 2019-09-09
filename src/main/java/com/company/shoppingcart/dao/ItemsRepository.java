package com.company.shoppingcart.dao;

import com.company.shoppingcart.dto.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

    List<Items> findByName(String name);
    List<Items> findByCategory(String category);

}