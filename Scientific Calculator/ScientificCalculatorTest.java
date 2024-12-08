package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFourWhenFourAdded() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(4);
        assertEquals(4, calculator.getValue());
    }

    @Test
    public void valueMinusOneWhenOneSubtracted() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.subtract(1);
        assertEquals(-1, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveSubtractedFromMemoryTen() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(10);
        calculator.save_in_memory();
        calculator.add(5);
        calculator.sub_memory();
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueTwentyWhenTenAddedToMemoryFive() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(5);
        calculator.save_in_memory();
        calculator.add(10);
        calculator.add_memory();
        assertEquals(20, calculator.getValue());
    }

    @Test
    public void valueIsZeroAfterClearingMemory() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(10);
        calculator.save_in_memory();
        calculator.clear_memory();
        calculator.load_memory();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueTenWhenLoadedFromMemory() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(10);
        calculator.save_in_memory();
        calculator.load_memory();
        assertEquals(10, calculator.getValue());
    }

    @Test
    public void valueFiveWhenTenDividedByTwo() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(10);
        calculator.divide(2);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueUnchangedWhenDividedByZero() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(10);
        calculator.divide(0);
        assertEquals(10, calculator.getValue());
    }

    @Test
    public void valueFourWhenSquareRootOfSixteen() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.square_root(16);
        assertEquals(4, calculator.getValue());
    }

    @Test
    public void valueUnchangedWhenSquareRootOfNegativeNumber() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.add(10);
        calculator.square_root(-16);
        assertEquals(10, calculator.getValue());
    }

    @Test
    public void valueSixteenWhenFourSquared() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.power2(4);
        assertEquals(16, calculator.getValue());
    }

    @Test
    public void valueZeroWhenZeroSquared() {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.power2(0);
        assertEquals(0, calculator.getValue());
    }
}
