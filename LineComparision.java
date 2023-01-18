package com.bridgelabz.Lines;
import java.util.Scanner;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparision program!!");
        int x1, y1, x2, y2, x11, x12, y11, y12;
        double len1, len2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of first length: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Enter the co-ordinates of second length: ");
        x11 = sc.nextInt();
        y11 = sc.nextInt();
        x12 = sc.nextInt();
        y12 = sc.nextInt();

        //calculate length distance.
        len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        len2 = Math.sqrt((x12 - x11) * (x12 - x11) + (y12 - y11) * (y12 - y11));
        System.out.println("Distance of Length1: " + len1);
        System.out.println("Distance of Length2: " + len2);
    }
}
