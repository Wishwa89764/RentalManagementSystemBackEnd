package edu.icet.crm.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    private long rentalId;
    private long itemCode;
    private String rentalDate;
    private String returnDate;
    private String exceedDate;
    private String fine;
    private double totalCost;
}
