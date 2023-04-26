package org.example.Calculator;

public class ComplexNumber extends Number {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public Number add(Number other) {
        if (other instanceof ComplexNumber) {
            ComplexNumber complex = (ComplexNumber) other;
            return new ComplexNumber(real + complex.getReal(), imaginary + complex.getImaginary());
        } else if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            return new ComplexNumber(real + rational.doubleValue(), imaginary);
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof ComplexNumber) {
            ComplexNumber complex = (ComplexNumber) other;
            return new ComplexNumber(real - complex.getReal(), imaginary - complex.getImaginary());
        } else if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            return new ComplexNumber(real - rational.doubleValue(), imaginary);
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof ComplexNumber) {
            ComplexNumber complex = (ComplexNumber) other;
            double realPart = real * complex.getReal() - imaginary * complex.getImaginary();
            double imagPart = real * complex.getImaginary() + imaginary * complex.getReal();
            return new ComplexNumber(realPart, imagPart);
        } else if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            return new ComplexNumber(real * rational.doubleValue(), imaginary * rational.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public Number divide(Number other) {
        if (other instanceof ComplexNumber) {
            ComplexNumber complex = (ComplexNumber) other;
            double denominator = Math.pow(complex.getReal(), 2) + Math.pow(complex.getImaginary(), 2);
            double realPart = (real * complex.getReal() + imaginary * complex.getImaginary()) / denominator;
            double imagPart = (imaginary * complex.getReal() - real * complex.getImaginary()) / denominator;
            return new ComplexNumber(realPart, imagPart);
        } else if (other instanceof RationalNumber) {
            RationalNumber rational = (RationalNumber) other;
            if (rational.doubleValue() == 0) {
                throw new IllegalArgumentException("Деление на ноль невозможно");
            }
            return new ComplexNumber(real / rational.doubleValue(), imaginary / rational.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }
    }

    @Override
    public String toString() {
        String sign = imaginary >= 0 ? "+" : "-";
        return String.format("%.2f %s %.2fi", real, sign, Math.abs(imaginary));
    }
}
