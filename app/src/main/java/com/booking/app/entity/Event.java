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
@Document(value = "Event")
public class Event implements Serializable {
    public static final Long serialVersionUID = 1L;

    private String eventId;
    private String title;
    private String description;
    private String type;
    private int durationInMinutes;
}
