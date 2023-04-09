package org.mpardo.apps.model;

public class FateCheckAnswers {
    
    private RollTotalRange rollTotal;

    private String fateQuestionAnswers;

    public FateCheckAnswers() {
    }

    public RollTotalRange getRollTotal() {
        return rollTotal;
    }

    public void setRollTotal(RollTotalRange rollTotal) {
        this.rollTotal = rollTotal;
    }

    public String getFateQuestionAnswers() {
        return fateQuestionAnswers;
    }

    public void setFateQuestionAnswers(String fateQuestionAnswers) {
        this.fateQuestionAnswers = fateQuestionAnswers;
    }

}
