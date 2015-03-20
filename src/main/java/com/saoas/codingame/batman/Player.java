package com.saoas.codingame.batman;

import java.util.Scanner;

/**
 * Created by s.ahmedouali on 20/03/2015.
 */
public class Player {

    private static int x;
    private static int y;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        x = X0;
        y = Y0;

        // game loop
        while (true) {
            String BOMB_DIR = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            //U (Up : les bombes sont situées au dessus de Batman)
            //UR (Up-Right : les bombes sont situées au dessus et à droite de Batman)
            //R (Right : les bombes sont situées à droite de Batman)
            //DR (Down-Right : les bombes sont situées en dessous et à droite de Batman)
            //D (Down : les bombes sont situées en dessous de Batman)
            //DL (Down-Left : les bombes sont situées en dessous et à gauche de Batman)
            //L (Left : les bombes sont situées à gauche de Batman)
            //UL (Up-Left : les bombes sont situées au dessus et à gauche de Batman)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if (BOMB_DIR.equals("U")) {
                up();
            } else if (BOMB_DIR.equals("UR")) {
                upRight();
            } else if (BOMB_DIR.equals("R")) {
                right();
            } else if (BOMB_DIR.equals("DR")) {
                downRight();
            } else if (BOMB_DIR.equals("D")) {
                down();
            } else if (BOMB_DIR.equals("DL")) {
                downLeft();
            } else if (BOMB_DIR.equals("L")) {
                left();
            } else if (BOMB_DIR.equals("UL")) {
                upLeft();
            }

            System.out.println(x + " " + y); // the location of the next window Batman should jump to.
        }
    }

    private static void up() {
        y--;
    }

    private static void upRight() {
        y--;
        x++;
    }

    private static void right() {
        x++;
    }

    private static void downRight() {
        y++;
        x++;
    }

    private static void down() {
        y++;
    }

    private static void downLeft() {
        y++;
        x--;
    }

    private static void left() {
        x--;
    }

    private static void upLeft() {
        x--;
        y--;
    }

}
