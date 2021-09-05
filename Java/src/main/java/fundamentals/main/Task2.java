package fundamentals.main;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*   Отобразить в окне консоли аргументы командной строки в обратном порядке.   */
        System.out.println("\n\nEnter the string of args:");
        Scanner scan = new Scanner(System.in);
        StringBuffer strArgs = new StringBuffer(scan.nextLine());
        strArgs.reverse();
        System.out.println(strArgs);
    }
}
