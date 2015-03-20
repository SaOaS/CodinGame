package com.saoas.codingame.marslander;

import java.util.Scanner;

/**
 * Created by s.ahmedouali on 20/03/2015.
 */
public class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < N; i++) {
            int LAND_X = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int LAND_Y = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int HS = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int VS = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int F = in.nextInt(); // the quantity of remaining fuel in liters.
            int R = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int P = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            //System.out.println("-45 4"); // R P. R is the desired rotation angle. P is the desired thrust power.
            int i = 0;
            if (i == 0) {
                System.out.println("-45 4");
            } else if (i == 1) {
                System.out.println("-30 4");
            } else if (i == 2) {
                System.out.println("-15 4");
            } else if (i == 3) {
                System.out.println("0 4");
            } else if (i == 4) {
                System.out.println("15 3");
            } else {
                System.out.println("0 0");
            }
            i++;
        }
    }
}
