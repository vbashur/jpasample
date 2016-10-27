package com.vbashur.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Column(name="POSITION")
    private String position;

    public Employee() {}
    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

}