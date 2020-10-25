package Exercises;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[50];

        System.out.print("Enter the integers between 1 and 50: ");
        for (int i = 0; i < number.length; i++) {
            int a = input.nextInt();
            number[a] += a;
            if (a == 0)
                break;
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                if (number[i] >= 2)
                    System.out.println(i + " occurs " + number[i] / i + " times");
                else
                    System.out.println(i + " occurs " + number[i] / i + " time");
            }
        }
    }
}



