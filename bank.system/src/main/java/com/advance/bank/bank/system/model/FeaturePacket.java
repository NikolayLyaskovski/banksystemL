package com.advance.bank.bank.system.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name ="feature_packages")
public class FeaturePacket {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private long price;
    @ManyToMany     //pri many to many se opisvva CASCADE (t.e kakvo se sluchva s zapisite svyrzani s nashiq ako byde delete)
    @JoinTable (
            name = "feature_packages_features",         //name of new table
            joinColumns = @JoinColumn  (name = "features_package_id"),  //left column on the table
            inverseJoinColumns = @JoinColumn(name = "feature_id")       //right column on that table
    )
    private Set<Feature> features = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }
}
