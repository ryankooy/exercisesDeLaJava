package com.company;

import java.util.Scanner;

public class Main {
    static int count = 0;

    public static int sum(int n) {
        for (int j = 0; j < n; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                count += j;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type a number.\n> ");
        int it = in.nextInt();
        try {
            sum(it);
            String str = String.format("The sum of the multiples of three and five that are less than %s is %d.", it, count);
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}