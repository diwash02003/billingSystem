package com.restapi.billingsystem.Repositories;

import com.restapi.billingsystem.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
