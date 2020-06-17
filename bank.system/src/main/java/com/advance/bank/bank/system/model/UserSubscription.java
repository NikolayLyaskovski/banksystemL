package com.advance.bank.bank.system.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user_subscriptions")
public class UserSubscription {

    @Id
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "user_subscriptions_features",
            joinColumns = @JoinColumn(name = "user_subscription_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private Set<Feature> features = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "user_subscriptions_feature_packages",
            joinColumns = @JoinColumn(name = "user_subscription_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_packages_id")
    )
    private Set<FeaturePacket> featuresPackages = new HashSet<>();

    @ManyToOne
    @JoinColumn(name= "account_id")
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
