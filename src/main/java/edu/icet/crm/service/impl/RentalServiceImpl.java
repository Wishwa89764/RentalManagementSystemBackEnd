package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Item;
import edu.icet.crm.dto.Rental;
import edu.icet.crm.dto.RentalDetails;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.repository.ItemRepository;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final ItemRepository itemRepository;
    final RentalRepository repository;
    @Override
    public void addRental(Rental rental) {
        RentalEntity rentalEntity = new ObjectMapper().convertValue(rental, RentalEntity.class);
        repository.save(rentalEntity);
    }

    @Override
    public Rental generateNewRental(RentalDetails rentalDetails) {
        Optional<ItemEntity> byId = itemRepository.findById(rentalDetails.getItemCode());

        Item item = new ObjectMapper().convertValue(byId.get(), Item.class);
        int day=0;
        double totalCost = item.getRentalPerDay()*day;
        return new Rental(
                1,
                rentalDetails.getItemCode(),
                "26/07/2024",
                rentalDetails.getReturnDate(),
                "not exceeded",
                "not fine",
                totalCost
        );
    }
}
