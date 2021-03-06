/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spvdi;

import java.time.LocalDate;

/**
 *
 * @author Alumne
 */
public class User {
 
    public User(int id, String name, String surname, int birthDate, String gender, String alive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
        this.alive = alive;
    }
 
    @Override
    public String toString() {
        return "id: " + id + ", " + name + " " + surname + ", " + birthDate + ", " + gender + ", " + alive;
    }
 
    private int id;
    private String name;
    private String surname;
    private int birthDate;
    private String gender;
    private String alive;
 
    public void setId(int id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setSurname(String surname) {
        this.surname = surname;
    }
 
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public void setAlive(String alive) {
        this.alive = alive;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public String getSurname() {
        return surname;
    }
 
    public int getBirthDate() {
        return birthDate;
    }
 
    public String getGender() {
        return gender;
    }
 
    public String isAlive() {
        return alive;
    }
 
}