package com.booking.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(value = "Order")
public class Order implements Serializable{
    public static final Long serialVersionUID = 1L;

    private String orderId;
    private User user;
    private Show show;
    private int numberOfSeats;
    private double totalAmount;
    // add discount and status code logic later
    private String status;
}
