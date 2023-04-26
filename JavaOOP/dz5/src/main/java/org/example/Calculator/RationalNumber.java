package org.example.Calculator;

public class RationalNumber extends Number {
    public final int numerator;
    public final int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public Number add(Number other) {
        if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            int lcm = lcm(denominator, rational.denominator);
            int num1 = numerator * (lcm / denominator);
            int num2 = rational.numerator * (lcm / rational.denominator);
            return new RationalNumber(num1 + num2, lcm);
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            int lcm = lcm(denominator, rational.denominator);
            int num1 = numerator * (lcm / denominator);
            int num2 = rational.numerator * (lcm / rational.denominator);
            return new RationalNumber(num1 - num2, lcm);
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            return new RationalNumber(numerator * rational.numerator, denominator * rational.denominator);
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public Number divide(Number other) {
        if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            if (rational.numerator == 0) {
                throw new IllegalArgumentException("Деление на ноль невозможно");
            }
            return new RationalNumber(numerator * rational.denominator, denominator * rational.numerator);
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}
