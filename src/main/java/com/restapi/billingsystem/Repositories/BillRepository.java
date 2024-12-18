package com.restapi.billingsystem.Repositories;

import com.restapi.billingsystem.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Item, Long> {
}
