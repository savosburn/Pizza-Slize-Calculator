/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_slices_and_pizza_per_person() {
        App myApp = new App();

        int numPeople = 8;
        int numPizzas = 2;
        int numSlices = 8;
        int totalSlices = numPizzas * numSlices;
        int pizzaPerPerson = totalSlices / numPeople;
        int leftoverPizza = 0;

        String expectedOutput = """
                8 people with 2 pizzas (16 slices)
                Each person gets 2 pieces of pizza.
                There are 0 leftover pieces.""";

        String actualOutput = myApp.stringConcat(numPeople, numPizzas, totalSlices, pizzaPerPerson, leftoverPizza);

        assertEquals(expectedOutput, actualOutput);
    }

}