package com.restapi.billingsystem.Service;

import com.restapi.billingsystem.Models.Bill;
import com.restapi.billingsystem.Models.Item;
import com.restapi.billingsystem.Repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    private final  ItemRepository itemRepository;

    public BillService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Bill generateBill() {
        List<Item> items = itemRepository.findAll();
        double totalPrice = 0.0;
        double total = 0.0;
        Bill bill = new Bill();
        for(Item item :items){
            total = item.getPrice() - item.getDiscount()/100 * item.getPrice();
            totalPrice = totalPrice + total;

        }
        bill.setTotalAmount(totalPrice);
        bill.setItems(items);
        return bill;
    }
}

