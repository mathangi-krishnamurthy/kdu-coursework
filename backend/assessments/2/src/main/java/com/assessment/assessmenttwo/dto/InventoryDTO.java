package com.assessment.assessmenttwo.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

//import java.util.int;

@Data
@Entity
@Table(name="inventory")
@RequiredArgsConstructor
public class InventoryDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private ProductDTO productDTO;

    private Integer quantity;
}
