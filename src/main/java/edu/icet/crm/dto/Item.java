package edu.icet.crm.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private long itemID;
    private String itemName;
    private double rentalPerDay;
    private double finePerDay;
    private String availability;
}
