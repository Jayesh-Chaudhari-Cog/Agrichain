package com.cts.agrichain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Farmer {
    public enum Status { PENDING_VERIFICATION, ACTIVE, REJECTED, SUSPENDED }

    @Id
    private String farmerId;
    private String name;
    private int dob;
    private String gender;
    private String address;
    private int contactInfo;
    private String landDetails;
    private Status status;


}
