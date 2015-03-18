package com.saoas.codingame.lecadeau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by s.ahmedouali on 18/03/2015.
 */
class Solution {
    //private static final Logger LOG = LogManager.getLogger(Solution.class);

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.err.println("le nombre de Oods participant au cadeau : " + N);
        int C = in.nextInt();
        System.err.println("le prix du cadeau : " + C);
        List<Integer> budgets = new ArrayList<Integer>();

        int avg = C / N;
        boolean equal = true;
        System.err.println("AVG : " + avg);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int B = in.nextInt();
            if (B < avg) {
                equal = false;
            }
            sum += B;
            System.err.println("Budget" + (i + 1) + " : " + B);
            budgets.add(B);
        }


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if (sum < C) {
            System.out.println("IMPOSSIBLE");
        }
        if (equal) {
            int diff = C - N * avg;
            for (int i = 0; i < N - diff; i++) {
                System.out.println(avg);
            }
            for (int i = N - diff; i < N; i++) {
                System.out.println(avg + 1);
            }
        }
        //Collections.sort(budgets);


    }
}