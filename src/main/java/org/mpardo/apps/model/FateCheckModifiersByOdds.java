package org.mpardo.apps.model;

public class FateCheckModifiersByOdds {
    
    private Odds odds;

    private Integer rollModifier;

    public FateCheckModifiersByOdds() {
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Integer getRollModifier() {
        return rollModifier;
    }

    public void setRollModifier(Integer rollModifier) {
        this.rollModifier = rollModifier;
    }

}
