package com.hibernate;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Customer
{
    @Id
    @Column(name="User_id")
    private int customerId;
    private String customerName;
    @OneToOne
    private Vehicle vehicle;
}
