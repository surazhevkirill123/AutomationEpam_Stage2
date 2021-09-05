package fundamentals.optional1;

import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        System.out.println("Введите число элементов в массиве:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int countsOfDigits = 0;
        int longestNumber = 0;
        int shortestNumber = 0;
        int longestNumberCount = 0;
        int shortestNumberCount = 0;

        for (int i = 0; i < n; i++) {
            if (getCountsOfDigits(array[i]) > countsOfDigits) {
                countsOfDigits = getCountsOfDigits(array[i]);
                longestNumber = array[i];
                longestNumberCount = getCountsOfDigits(array[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (getCountsOfDigits(array[i]) < countsOfDigits) {
                countsOfDigits = getCountsOfDigits(array[i]);
                shortestNumber = array[i];
                shortestNumberCount = getCountsOfDigits(array[i]);
            }
        }

        System.out.println(String.format("Самое короткое число: %d \t Его длина: %d", shortestNumber, shortestNumberCount));
        System.out.println(String.format("Самое длинное число: %d \t Его длина: %d", longestNumber, longestNumberCount));
    }
}
