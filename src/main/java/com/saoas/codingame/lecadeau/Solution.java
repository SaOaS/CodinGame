package com.saoas.codingame.lecadeau;

import java.util.ArrayList;
import java.util.Collections;
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

        for (int i = 0; i < N; i++) {
            int B = in.nextInt();
            System.err.println("Budget" + (i + 1) + " : " + B);
            budgets.add(B);
        }


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Collections.sort(budgets);
        doWork(budgets, C);


    }

    private static void doWork(List<Integer> budgets, int price) {
        if (isPossible(budgets, price)) {
            if (isFixedFee(budgets, price)) {
                fixedFee(budgets, price);
            } else {
                List<Integer> newBudgets = budgets.subList(1, budgets.size());
                int newPrice = price - budgets.get(0);
                System.out.println(budgets.get(0));
                doWork(newBudgets, newPrice);
            }
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    private static boolean isPossible(List<Integer> budgets, int price) {
        Integer sum = 0;
        for (Integer i : budgets)
            sum += i;
        return (price <= sum);
    }

    private static boolean isFixedFee(List<Integer> budgets, int price) {
        int participants = budgets.size();
        int avg = price / participants;
        for (Integer i : budgets)
            if (i < avg) {
                return false;
            }
        return true;
    }

    private static void fixedFee(List<Integer> budgets, int price) {
        int participants = budgets.size();
        int avg = price / participants;
        int diff = price - participants * avg;

        for (int i = 0; i < participants - diff; i++) {
            System.out.println(avg);
        }
        for (int i = participants - diff; i < participants; i++) {
            System.out.println(avg + 1);
        }
    }


}