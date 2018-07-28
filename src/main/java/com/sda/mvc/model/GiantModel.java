package com.sda.mvc.model;

public class GiantModel {
    private Fatigue fatigue;
    private Health health;
    private Nourishment nourishment;

    public GiantModel(Fatigue fatigue, Health health, Nourishment nourishment) {
        this.fatigue = fatigue;
        this.health = health;
        this.nourishment = nourishment;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "fatigue=" + fatigue +
                ", health=" + health +
                ", nourishment=" + nourishment +
                '}';
    }
}
