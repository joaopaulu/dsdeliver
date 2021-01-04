package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.model.Product;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDTO implements Serializable {

    private static final long seriaLVersionUID = 1L;

    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;

    public ProductDTO(){
    }

    public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUri = imageUri;
    }

    public ProductDTO(Product entity) {
        super();
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        description = entity.getDescription();
        imageUri = entity.getImageUri();
    }
}
