package com.tomer2h.LibraryApplication.EntityBeans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class User {
    @Id
    private int id;
    private UserCredentials userCredentials;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToMany
    private List<Book> books;
    private int maxAllowedBooks;
    private String city;
    private String Address;
}
