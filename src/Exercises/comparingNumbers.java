package Exercises;

import java.util.Scanner;

public class comparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 11 numbers (integer) : ");
        int[] number = new int[11];

        for (int i = 0; i < 11; i++) {
            number[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {

           if (number[i] > number[10])
                System.out.println(number[i] + " is greater than " + number[10]);

            else if
            (number[i] < number[10])
                System.out.println(number[i] + " is smaller than " + number[10]);
            else
                System.out.println(number[i] + " is equal to the " + number[10]);

        }
    }




}
