package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Item;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.repository.ItemRepository;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository repository;
    @Override
    public void addItem(Item item){
        ItemEntity itemEntity = new ObjectMapper().convertValue(item, ItemEntity.class);
        repository.save(itemEntity);
    }
}
