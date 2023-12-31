package org.example.Calculator;

public abstract class Number {
    public abstract Number add(Number other);

    public abstract Number subtract(Number other);

    public abstract Number multiply(Number other);

    public abstract Number divide(Number other);

    public double doubleValue() {
        return ((Number) this).doubleValue();
    }
}
