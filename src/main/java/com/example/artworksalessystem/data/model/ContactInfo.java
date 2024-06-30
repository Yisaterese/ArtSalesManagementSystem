package com.example.artworksalessystem.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Setter
@Getter
@Entity
public class ContactInfo {
    @Id
    private Long id;
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid email format. Please provide a valid email address.")
    private String email;
    private String phoneNumber;
    private String websiteAddress;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
