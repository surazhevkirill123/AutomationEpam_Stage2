package fundamentals.optional1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("Введите число элементов в массиве:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);
        String sortedArrayString = " ";
        for (int i = 0; i < n; i++) {
            sortedArrayString += array[i];
            sortedArrayString += " ";
        }
        System.out.println(String.format("По возрастанию: %s", sortedArrayString));
        StringBuffer strBuffs = new StringBuffer(sortedArrayString);
        strBuffs.reverse();
        System.out.println(String.format("По убыванию: %s", strBuffs));
    }
}
