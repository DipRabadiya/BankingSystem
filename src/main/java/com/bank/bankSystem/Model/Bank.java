package com.bank.bankSystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String acNo;
//    private String acHolderName;
//    private Double balance;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String acNo;

    private String generateRandomNumber() {
        long min = 100000000000L;
        long max = 999999999999L;
        long randomNumber = min + (long) (Math.random() * (max - min));
        return String.valueOf(randomNumber);
    }

    @PrePersist
    public void generateNumber() {
        this.acNo = generateRandomNumber();
    }
    private String acHolderName;
    private String address;
    private String email;
    private String phoneNo;
    private String postalZip;
    private String region;
    private Double balance;
}