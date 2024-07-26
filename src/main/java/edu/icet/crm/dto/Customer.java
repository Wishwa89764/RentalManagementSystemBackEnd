package edu.icet.crm.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long customerID;
    private String name;
    private String city;
    private String contact;
}
