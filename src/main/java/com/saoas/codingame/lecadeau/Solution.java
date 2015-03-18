package com.saoas.codingame.lecadeau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Enoncé
 * <p/>
 * Dans cet épisode, le TARDIS (la machine à voyager dans le temps du Docteur Who) se matérialise en l'an 4798 sur la Ood-Sphere, une planète habitée par les Oods, une civilisation étrange mais néanmoins très avancée.
 * Les Oods ne sont pas particulièrement agréables à regarder : des tentacules disgracieux leur pendent au bas du visage. Bien qu'ils soient monstrueux, les Oods sont des créatures très sensibles qui n'ont pas la notion d'individualité. Ils pensent qu'ils ne forment qu'un tout unique et communiquent entre eux par télépathie.
 * <p/>
 * <img src="http://code.codingame.com/fileservlet?id=862478360113" />
 * <p/>
 * En réalité, le Docteur atterrit au beau milieu d'une cérémonie Oodienne. L'un des Oods ayant atteint l'âge de la maturité, le reste de la communauté souhaite lui offrir un magnifique cadeau. Seulement, tous ont un budget différent à investir dans ce cadeau, et bien sûr, leur unique souhait est de parvenir à déterminer le partage qui soit le plus équitable possible tout en restant dans les limites des budgets de chacun. Les Oods réfléchissent à la méthode optimale depuis des jours et n'ont toujours pas réussi à s'accorder sur une solution satisfaisante.
 * Le Docteur décide donc de leur donner un coup de main en créant un programme. Son idée est de s'assurer que les Oods ont assez d'argent pour acheter le cadeau et si oui, de déterminer la somme dont chaque Ood devra s'acquitter dans la limite de son budget. De plus pour faciliter les comptes, le Docteur souhaite que la participation de chacun soit un nombre entier de la monnaie locale (personne ne doit donner de centimes).
 * Le Docteur a en main la liste des budgets maximum de chaque Ood.
 * <p/>
 * Pour respecter les aspirations démocratiques des Oods et pour départager les différentes solutions, le Docteur décide que :
 * <ul>
 * <li>aucun Ood ne peut mettre plus que son budget maximal
 * <li>la solution optimale est celle pour laquelle la plus grande contribution est minimale
 * <li>s'il y a plusieurs solutions optimales, on prend la solution pour laquelle la deuxième plus grande contribution d'un participant est minimale et ainsi de suite...
 * </ul>
 * <p/>
 * Created by s.ahmedouali on 18/03/2015.
 */
public class Solution {
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
//            System.err.println("Budget" + (i + 1) + " : " + B);
            budgets.add(B);
        }


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Collections.sort(budgets);
        doWork(budgets, C);


    }

    /**
     * My algorithm
     * @param budgets
     * @param price
     */
    protected static void doWork(List<Integer> budgets, int price) {
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

    /**
     * Si il est possible d'acheter le cadeau
     *
     * @param budgets
     * @param price
     * @return
     */
    protected static boolean isPossible(List<Integer> budgets, int price) {
        Integer sum = 0;
        for (Integer i : budgets)
            sum += i;
        return (price <= sum);
    }

    /**
     * condition: contribution égale
     *
     * @param budgets
     * @param price
     * @return
     */
    protected static boolean isFixedFee(List<Integer> budgets, int price) {
        int participants = budgets.size();
        int avg = price / participants;
        for (Integer i : budgets)
            if (i < avg) {
                return false;
            }
        return true;
    }

    /**
     * contribution égale : algo
     *
     * @param budgets
     * @param price
     */
    protected static void fixedFee(List<Integer> budgets, int price) {
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