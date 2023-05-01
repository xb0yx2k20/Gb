package org.example;

public class ComplexNumber {
    private double real;
    private double imaginary;

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

    public ComplexNumber add(ComplexNumber number) {
        double realResult = this.real + number.real;
        double imaginaryResult = this.imaginary + number.imaginary;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double realResult = this.real * number.real - this.imaginary * number.imaginary;
        double imaginaryResult = this.real * number.imaginary + this.imaginary * number.real;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber divide(ComplexNumber number) {
        double denominator = number.real * number.real + number.imaginary * number.imaginary;
        double realResult = (this.real * number.real + this.imaginary * number.imaginary) / denominator;
        double imaginaryResult = (this.imaginary * number.real - this.real * number.imaginary) / denominator;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }

}

