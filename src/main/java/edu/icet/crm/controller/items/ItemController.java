package edu.icet.crm.controller.items;

import edu.icet.crm.dto.Item;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-controller")
@RequiredArgsConstructor
public class ItemController {
    final ItemService service;

    @PostMapping("/add-item")
    public void addItem(@RequestBody Item item){
        service.addItem(item);
    }
}
