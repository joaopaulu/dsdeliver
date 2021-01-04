package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.model.Order;
import com.devsuperior.dsdeliver.model.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class OrderDTO implements Serializable {

    private static final long seriaLVersionUID = 1L;

    private Long id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;

    private List<ProductDTO> products = new ArrayList<>();

    public OrderDTO(){
    }

    public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
        this.id = id;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.moment = moment;
        this.status = status;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        address = entity.getAddress();
        latitude = entity.getLatitude();
        longitude = entity.getLongitude();
        moment = entity.getMoment();
        status = entity.getStatus();
        products = entity.getProducts().stream()
                .map(ProductDTO::new).collect(Collectors.toList());
    }
}
