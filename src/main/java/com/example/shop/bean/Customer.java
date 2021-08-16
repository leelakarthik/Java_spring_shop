package com.example.shop.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    
    public Customer() {
    }
    @Override
    public String toString() {
        return "Customer [date_of_birth=" + date_of_birth + ", email=" + email + ", father_name=" + father_name
                + ", id=" + id + ", password=" + password + ", username=" + username + "]";
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String father_name;
    private String email;
    private Date date_of_birth;
    private String password;
    public Customer(String username, String father_name, String email, Date date_of_birth, String password) {
        this.username = username;
        this.father_name = father_name;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFather_name() {
        return father_name;
    }
    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
