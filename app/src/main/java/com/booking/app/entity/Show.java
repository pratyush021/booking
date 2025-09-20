package com.booking.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(value = "Show")
public class Show implements Serializable {
    private static final long serial_version_UID = 1L;

    private String showId;
    private Event event;
    private Venue venue;
    private LocalDateTime startTime;
    private int availableSeats; // decrements on booking

}
