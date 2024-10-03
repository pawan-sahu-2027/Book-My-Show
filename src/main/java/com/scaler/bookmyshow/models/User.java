package com.scaler.bookmyshow.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User extends BaseModel {
    private String email;
    private String password;
    private long phonenumber;
}
