package com.advance.bank.bank.system.model;


import javax.persistence.*;

@Entity
@Table (name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //za da se incrementira bez povtorenie
    private Long id;
    @Column
    private String name;
    @Column(name = "post_code")
    private String postalCode;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
