package com.saoas.codingame.lecadeau;

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
        for (int i = 0; i < N; i++) {
            int B = in.nextInt();
            System.err.println("Budget" + (i + 1) + " : " + B);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("IMPOSSIBLE");
    }
}