package com.hibernate;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Vehicle
{
    @Id
    @Column(name = "Vehicle_Id")
    private int vehicleId;
    private String vehicleName;
}
