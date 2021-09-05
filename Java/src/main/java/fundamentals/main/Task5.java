package fundamentals.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /* Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
         Осуществить проверку корректности ввода чисел. */
        System.out.println("Enter the month number");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        try {
            number = scan.nextInt();
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Number should be int");
        }

        if (number < 1 || number > 12) {
            throw new IllegalArgumentException("Number should be for 1 to 12");
        }

        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
