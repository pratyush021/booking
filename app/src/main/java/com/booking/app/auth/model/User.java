package com.booking.app.auth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(value = "User")
public class User implements Serializable {
    
    public static long serialVersio`nUID = 1L;

    @Id
    private String userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String passwordHash;
}
