package com.RakutechApplication.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, length = 45)
    private String password;

    @Column(nullable = false, unique = true, length = 45)
    private String fullName;

    private User(){}

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User employee = (User) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(password, employee.password) &&
                Objects.equals(fullName, employee.fullName);
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, email, password, fullName);
    }

    //GETTERS
    public long getId() {

        return id;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {

        return password;
    }

    public String getFullName() {

        return fullName;
    }

    //SETTERS

    public void setId(long id) {

        this.id = id;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }


}
