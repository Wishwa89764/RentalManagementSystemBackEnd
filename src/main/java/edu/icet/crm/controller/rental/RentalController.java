package edu.icet.crm.controller.rental;

import edu.icet.crm.dto.Rental;
import edu.icet.crm.dto.RentalDetails;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental-controller")
@RequiredArgsConstructor
public class RentalController {
    final RentalService service;

    @GetMapping("/generate-rental")
    public Rental searchRentalDetails(@RequestBody RentalDetails rentalDetails){
        return service.generateNewRental(rentalDetails);
    }
    @PostMapping("/add-rental")
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);
    }
}
