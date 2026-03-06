package com.cts.agrichain.entity;


public class Farmer {
    public enum Status { PENDING_VERIFICATION, ACTIVE, REJECTED, SUSPENDED }

    private String farmerId;
    private String name;
    private String dob;           // consider LocalDate; ensure format & age validation
    private String gender;
    private String address;
    private String contactInfo;
    private String landDetails;
    private Status status;

    // Constructors, getters, setters
}
