package com.cts.agrichain.entity;
import com.cts.agrichain.enums.UserRole;
import com.cts.agrichain.enums.UserStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.*;

public class User {
    private  int userId;
    private String name;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }




}