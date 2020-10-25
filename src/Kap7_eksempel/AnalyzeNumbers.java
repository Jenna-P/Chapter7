package Kap7_eksempel;

import java.util.Arrays;
import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble(); //numbers 배열을 유저 아웃풋으로 정의/생성
            sum += numbers[i]; //각각의 배열 숫자를 0 + 첫번쨰 배열숫자 + 0 + 두번쨰 배열숫자....

        }

        double average = sum / n;

        int count = 0; //배열중 평균보다 높은 숫자들을 세기 위해서
        for (int i = 0; i < n; i++) {
            if(numbers[i] > average) {
                count++;

                System.out.printf("Average is %f \n ",  average);
                System.out.println("Number of elements above the average is " + count);
            }

        }

    }
}
