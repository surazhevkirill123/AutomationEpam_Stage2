package fundamentals.main;

import fundamentals.classes.ArrayNumbers;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*    Вывести заданное количество случайных чисел с переходом и без перехода на новую строку    */
        System.out.println("\n\nEnter the size of the array:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Array creation in progress...");
        System.out.println("Initial array:");
        ArrayNumbers arr = new ArrayNumbers();
        double[] numbers = arr.randomFillArray(size);
        arr.print(numbers);
        System.out.println("Reverse array:");
        arr.printReverse(numbers);
    }
}
