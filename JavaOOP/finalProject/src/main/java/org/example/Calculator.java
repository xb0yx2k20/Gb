package org.example;

public class Calculator {
    private ComplexNumber result;

    public Calculator() {
        result = new ComplexNumber(0, 0);
    }

    public void add(ComplexNumber number) {
        result = result.add(number);
    }

    public void multiply(ComplexNumber number) {
        result = result.multiply(number);
    }

    public void divide(ComplexNumber number) {
        result = result.divide(number);
    }

    public ComplexNumber getResult() {
        return result;
    }
}

