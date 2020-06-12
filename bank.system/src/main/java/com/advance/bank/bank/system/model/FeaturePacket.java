package com.advance.bank.bank.system.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FeaturePacket {
    private Long id;
    private String name;
    private String description;
    private long price;
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
