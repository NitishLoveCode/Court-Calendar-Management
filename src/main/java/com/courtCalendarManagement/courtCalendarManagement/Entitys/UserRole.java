package com.courtCalendarManagement.courtCalendarManagement.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    int id;

    @Column( name = "is_admin")
    Boolean is_Admin;
    @Column( name = "payment")
    Boolean payment;
    @Column( name = "amount_paid")
    int amount_Paid;
}
