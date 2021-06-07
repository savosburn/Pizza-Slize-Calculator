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

        // Input
        int numPeople = myApp.numOfPeople();
        int numPizzas = myApp.numOfPizzas();
        int numSlices = myApp.slicesPerPizza();

        // Calculations
        int totalSlices = numPizzas * numSlices;
        int pizzaPerPerson = totalSlices / numPeople;
        int leftoverPizza = totalSlices % numPeople;

        // Output
        String generateOutput = myApp.stringConcat(numPeople, numPizzas, totalSlices, pizzaPerPerson, leftoverPizza);
        myApp.output(generateOutput);
    }

    public int numOfPeople() {
        System.out.print("How many people? ");

        // User can only enter number
        while (!in.hasNextInt()) {
            System.out.print("Invalid amount of people. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public int numOfPizzas() {
        System.out.print("How many pizzas do you have? ");

        // User can only enter number
        while (!in.hasNextInt()) {
            System.out.print("Invalid number of pizzas. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public int slicesPerPizza() {
        System.out.print("How many slices per pizza? ");

        // User can only enter number
        while (!in.hasNextInt()) {
            System.out.print("Invalid number of slices. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public String stringConcat(int numPeople, int numPizzas, int totalSlices, int pizzaPerPerson, int leftoverPizza) {

        String pizzaInsert = numPizzas == 1 ? "pizza" : "pizzas";
        String slicesInsert = totalSlices == 1 ? "slice" : "slices";
        String piecesInsert = pizzaPerPerson == 1 ? "piece" : "pieces";
        String peopleInsert = numPeople == 1 ? "person" : "people";

        String stringOne = String.format("%d %s with %d %s (%d %s)\n", numPeople, peopleInsert, numPizzas, pizzaInsert,
                totalSlices, slicesInsert);
        String stringTwo = String.format("Each person gets %d %s of pizza.\n", pizzaPerPerson, piecesInsert);
        String stringThree = leftoverPizza == 1 ? String.format("There is %d leftover piece.", leftoverPizza) :
                String.format("There are %d leftover pieces.", leftoverPizza);

        return stringOne + stringTwo + stringThree;
    }

    public void output(String generateOutput) {
        System.out.println(generateOutput);
    }
}
