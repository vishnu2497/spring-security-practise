package com.vishnu.security.practise.model;

public class AppUser {

    private String userName;

    private String age;

    private String designation;

    private String userId;

    public AppUser() {
    }

    public AppUser(String userName, String age, String designation, String userId) {
        this.userName = userName;
        this.age = age;
        this.designation = designation;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}
