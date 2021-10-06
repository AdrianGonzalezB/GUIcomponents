/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spvdi;

import java.time.LocalDate;

/**
 *
 * @author Alumne
 */
public class User {

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdDate() {
        return birthdDate;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public User(int id, String firstName, String lastName, LocalDate birthdDate, boolean isAlive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdDate = birthdDate;
        this.isAlive = isAlive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdDate(LocalDate birthdDate) {
        this.birthdDate = birthdDate;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", birthdDate=" + birthdDate + ", isAlive=" + isAlive + '}';
    }
    private int id;
    private String firstName, lastName, gender;
    private LocalDate birthdDate;
    private boolean isAlive;
}
