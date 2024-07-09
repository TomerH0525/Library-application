package com.tomer2h.LibraryApplication.EntityBeans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LibraryEmployee {
    @Id
    private int id;
    private UserCredentials userCredentials;
}
