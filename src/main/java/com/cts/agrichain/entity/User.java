package com.cts.agrichain.entity;
import java.util.*;

public class User {

    public enum Role { FARMER, TRADER, OFFICER, MANAGER, ADMIN, COMPLIANCE, AUDITOR }
    public enum Status { ACTIVE, INACTIVE, LOCKED, PENDING_ACTIVATION }

    private String userId;
    private String name;
    private Role role;
    private String email;
    private String phone;
    private Status status;


}