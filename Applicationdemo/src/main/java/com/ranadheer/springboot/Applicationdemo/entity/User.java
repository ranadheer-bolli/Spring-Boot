package com.ranadheer.springboot.Applicationdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "password")
    private String password;

    public void setId(int id){this.id=id;}
    public void setUserName(String userName){this.userName=userName;}
    public void setEmail(String email){this.email=email;}
    public void setPhoneNo(String phoneNo){this.phoneNo=phoneNo;}
    public void setPassword(String password){this.password=password;}

    public int getId(){return this.id;}
    public String getUserName(){return this.userName;}
    public String getEmail(){return this.email;}
    public String getPhoneNo(){return this.phoneNo;}
    public String getPassword(){return this.password;}


    public String toString(){
        return "Username: "+userName+" email "+email+" phone no: "+phoneNo;
    }



}
