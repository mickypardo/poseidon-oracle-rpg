package org.mpardo.apps.model;

public class OddsValues {
    private Integer min;
    private Integer max;
    private Integer value;
    
    public OddsValues(Integer min, Integer value, Integer max) {
        this.min = min;
        this.value = value;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
