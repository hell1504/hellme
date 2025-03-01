package org.example.dom1;

public class NegativeNumberException extends Exception {
    private double number;

    public NegativeNumberException(double number) {
        this.number = number;
    }
    public double getNumber() {
        return number;
    }
}