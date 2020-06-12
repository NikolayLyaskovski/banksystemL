package com.advance.bank.bank.system.model;

import java.util.HashSet;
import java.util.Set;

public class UserSubscription {

    private Long id;
    private Set<Feature> features = new HashSet<>();
    private Set<FeaturePacket> featuresPackages = new HashSet<>();
    private Account account;


    public Long getId() {
        return id;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<FeaturePacket> getFeaturesPackages() {
        return featuresPackages;
    }

    public void setFeaturesPackages(Set<FeaturePacket> featuresPackages) {
        this.featuresPackages = featuresPackages;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
