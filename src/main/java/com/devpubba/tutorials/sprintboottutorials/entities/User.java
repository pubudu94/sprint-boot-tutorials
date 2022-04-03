package com.devpubba.tutorials.sprintboottutorials.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

    private @Id
    @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String name;
    private String mobileNumber;
    private String address;

    public User(String name, String mobileNumber, String address) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

}

