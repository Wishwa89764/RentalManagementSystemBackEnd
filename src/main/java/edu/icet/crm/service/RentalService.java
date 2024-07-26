package edu.icet.crm.service;

import edu.icet.crm.dto.Rental;
import edu.icet.crm.dto.RentalDetails;

public interface RentalService {
    void addRental(Rental rental);
    Rental generateNewRental(RentalDetails rentalDetails);
}
