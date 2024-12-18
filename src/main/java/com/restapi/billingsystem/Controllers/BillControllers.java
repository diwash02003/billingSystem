package com.restapi.billingsystem.Controllers;

import com.restapi.billingsystem.Models.Bill;
import com.restapi.billingsystem.Models.Item;
import com.restapi.billingsystem.Service.BillService;
import com.restapi.billingsystem.Service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BillControllers {
    private  final BillService billService;
    private final ItemService itemService;


    public BillControllers(BillService billService, ItemService itemService) {
        this.billService = billService;
        this.itemService = itemService;
    }


    @GetMapping("/form")
    public String itemForm(Model model) {
        model.addAttribute("item", new Item());
        return "formPage";
    }

    @PostMapping("/save")
    public String itemFormSave(@ModelAttribute  Item item){
        itemService.saveItem(item);
        return "redirect:/form";
    }

    @GetMapping("/bill")
    public String showBill(Model model) {
        Bill bill = billService.generateBill();

        model.addAttribute("bill", bill);

        return "bill";
    }

}

