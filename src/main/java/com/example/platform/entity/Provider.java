package com.example.platform.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Provider implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false)
    private String pass;

    public Provider() {
    }

    public Provider(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
