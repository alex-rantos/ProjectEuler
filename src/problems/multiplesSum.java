package problems;

import java.util.Scanner;

public class multiplesSum {
    public void findSum() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nYou are required to type two natural numbers " +
                "in order to find their multiples sum below X number");
        System.out.println("Type the first natural number.");
        long firstNumber = keyboard.nextLong();
        System.out.println("Type the second natural number.");
        long secondNumber = keyboard.nextLong();
        System.out.println("Now type below which number the program must search" +
                "to find the sum of all multiples.");

        long maxNumber = keyboard.nextLong();

        maxNumber--; // maxNumber is not included

        long firstFloor = Math.floorDiv(maxNumber,firstNumber),
                secondFloor = Math.floorDiv(maxNumber,secondNumber),
                productFloor = Math.floorDiv(maxNumber,firstNumber*secondNumber);

        long result = ( firstNumber*(firstFloor*(firstFloor + 1)) + secondNumber*(secondFloor*(secondFloor+1))
                    - (firstNumber*secondNumber)*productFloor*(productFloor+1)) / 2;

        System.out.println("The sum of all the multiples of " + firstNumber + " and "
                + secondNumber + " below " + maxNumber+1 + " is [" + result + "]");
    }
}
