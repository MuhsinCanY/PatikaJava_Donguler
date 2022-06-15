package Donguler;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tempx = x;
        int counter = 0;
        int result = 0;

        while (tempx != 0) {
            tempx /= 10;
            counter++;
        }

        for (int i = 0; i < counter; i++) {
            int digit = x % 10;
            result += digit;
            x /= 10;
        }
        System.out.println(result);
    }
}
