/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex08;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int numPeople = myApp.numOfPeople();
        int numPizzas = myApp.numOfPizzas();
        int numSlices = myApp.slicesPerPizza();

        int totalSlices = numPizzas * numSlices;
        int pizzaPerPerson = totalSlices / numPeople;
        int leftoverPizza = totalSlices % numPeople;

        String generateOutput = myApp.stringConcat(numPeople, numPizzas, totalSlices, pizzaPerPerson, leftoverPizza);
        myApp.output(generateOutput);
    }

    public int numOfPeople() {
        System.out.print("How many people? ");
        return in.nextInt();
    }

    public int numOfPizzas() {
        System.out.print("How many pizzas do you have? ");
        return in.nextInt();
    }

    public int slicesPerPizza() {
        System.out.print("How many slices per pizza? ");
        return in.nextInt();
    }

    public String stringConcat(int numPeople, int numPizzas, int totalSlices, int pizzaPerPerson, int leftoverPizza) {
        String stringOne = String.format("%d people with %d pizzas (%d slices)\n", numPeople, numPizzas, totalSlices);
        String stringTwo = String.format("Each person gets %d pieces of pizza.\n", pizzaPerPerson);
        String stringThree = String.format("There are %d leftover pieces.", leftoverPizza);

        return stringOne + stringTwo + stringThree;
    }

    public void output(String generateOutput) {
        System.out.println(generateOutput);
    }
}
