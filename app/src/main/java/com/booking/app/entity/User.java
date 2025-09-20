package com.booking.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(value = "User")
public class User implements Serializable {
    
    public static long serialVersionUID = 1L;

    private String userId;
    private String name;
    private String email;
    private String phoneNumber;
    private List<Order> orders;

}
