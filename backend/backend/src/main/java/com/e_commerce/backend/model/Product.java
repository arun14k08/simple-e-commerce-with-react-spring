package com.e_commerce.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description ;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private int stockQuantity;
    private boolean productAvailable;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
