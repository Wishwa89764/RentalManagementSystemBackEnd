package edu.icet.crm.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RentalDetails {
    private long itemCode;
    private int itemQty;
    private String returnDate;
}
