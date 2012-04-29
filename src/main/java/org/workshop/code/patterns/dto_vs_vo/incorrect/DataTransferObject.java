package org.workshop.code.patterns.dto_vs_vo.incorrect;

public class DataTransferObject {
    
    private String value1;
    private int value2;
    
    public DataTransferObject() {
        
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
