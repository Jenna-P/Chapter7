package Exercises;

import java.util.Scanner;

public class AssignGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = input.nextInt();
        int[] studentsNum = new int[n];
        int[] score = new int[n];

        System.out.println("Enter " + n + " scores : ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            studentsNum[i] = i;
        }

        int best = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > best)
                best = score[i];
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= best - 5) {
                System.out.println("Student " + studentsNum[i] + "score is " + score[i] +
                        " and grade is A");
            } else if
            (score[i] >= best - 10) {
                System.out.println("Student " + studentsNum[i] + "score is " + score[i] +
                        " and grade is B");

            } else if
            (score[i] >= best - 15) {
                System.out.println("Student " + studentsNum[i] + "score is " + score[i] +
                        " and grade is C");
            } else if
            (score[i] >= best - 20) {
                System.out.println("Student " + studentsNum[i] + "score is " + score[i] +
                        " and grade is D");
            } else {
                System.out.println("Student " + studentsNum[i] + " score is " + score[i] +
                        " and grade is F");

            }

        }

    }

}




