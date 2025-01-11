package ru.job4j;
import java.util.Scanner;

public class PseudoCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " Это чётное число");
        } else {
            System.out.println(number + " Это нечётное число");
        }
        scanner.close();
    }
}
