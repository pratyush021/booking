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
@Document(value = "Venue")
public class Venue implements Serializable {
    public static final Long serialVersionUID = 1L;

    private String venueId;
    private String name;
    private String city;
    private int totalSeats;
}
