package com.arithmetic;

import java.io.Serializable;

public class User implements Serializable{
    
    private static final long serialVersionUID = 6923329371354707080L;
    
    private String username;
    
    private Integer age;
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username ) {
        this.username = username;
    }
    
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age ) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User [username=" + this.username + ", age=" + this.age + "]";
    }
    
    public static void main(String[] args ) {
        System.out.println("我是User!");
    }
    
}
