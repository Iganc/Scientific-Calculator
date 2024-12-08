package org.example;

public class ScientificCalculator {

    private double value;
    private double memory;

    public ScientificCalculator() {
        this.value = 0;
        this.memory = 0;
    }


    public void add(int number) {
        this.value += number;
    }


    public void subtract(int number) {
        this.value -= number;
    }


    public void divide(int number) {
        if (number != 0) {
            this.value /= number;
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }


    public void square_root(double number) {
        if (number >= 0) {
            this.value = Math.sqrt(number);
        } else {
            System.out.println("Cannot take the square root of a negative number!");
        }
    }


    public void power2(int number) {
        this.value = number * number;
    }


    public void save_in_memory() {
        this.memory = this.value;
    }


    public void add_memory() {
        this.value += this.memory;
    }


    public void sub_memory() {
        this.value -= this.memory;
    }


    public void clear_memory() {
        this.memory = 0;
    }


    public void load_memory() {
        this.value = this.memory;
    }


    public double getValue() {
        return this.value;
    }
}
