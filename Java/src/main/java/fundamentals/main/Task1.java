package fundamentals.main;

import fundamentals.classes.ArrayNumbers;
import fundamentals.filter.StringFilter;
import fundamentals.operation.OperationArray;
import fundamentals.reader.InfoReader;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*  Приветствовать любого пользователя при вводе его имени через командную строку.  */
        System.out.println("Hello, enter user name, please:");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println(String.format("Hello, %s !\nHave a nice day!", userName));
    }
}