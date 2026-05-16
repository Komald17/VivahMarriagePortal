package com.portal.entity;


public class Admin {

    private long adminId;
    private String username;
    private String passwordHash;
    private String createdAt;

    // Default Constructor

    public Admin() {

    }

    // Parameterized Constructor

    public Admin(long adminId,
                 String username,
                 String passwordHash,
                 String createdAt) {

        this.adminId = adminId;
        this.username = username;
        this.passwordHash = passwordHash;
        this.createdAt = createdAt;
    }

    // Getter and Setter for adminId

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    // Getter and Setter for username

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for passwordHash

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    // Getter and Setter for createdAt

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
