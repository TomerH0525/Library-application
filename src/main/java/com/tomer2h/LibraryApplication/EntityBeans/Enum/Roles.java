package com.tomer2h.LibraryApplication.EntityBeans.Enum;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

public enum Roles {
    USER,EMPLOYEE,MANAGER,ADMIN;
}
