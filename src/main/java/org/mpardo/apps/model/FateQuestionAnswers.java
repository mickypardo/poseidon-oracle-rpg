package org.mpardo.apps.model;

public class FateQuestionAnswers {
    
    private AnswerOracle answerOracle;

    private String result;

    private String hint;

    public FateQuestionAnswers() {
    }

    public AnswerOracle getAnswerOracle() {
        return answerOracle;
    }

    public void setAnswerOracle(AnswerOracle answerOracle) {
        this.answerOracle = answerOracle;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

}
