package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rentalId;
    private long itemCode;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private String exceedDate;
    private String fine;
    private double totalCost;
}
