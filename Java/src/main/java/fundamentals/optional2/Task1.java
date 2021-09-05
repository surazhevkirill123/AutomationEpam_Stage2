package fundamentals.optional2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число М:");
        int n=sc.nextInt();
        int[][]array=new int[n][n];
        Random rnd=new Random();
        int M=20;
        for (int i=0;i<array.length;i++)
            for (int j=0;j<array.length;j++){
                array[i][j]=rnd.nextInt(2*M+1);
                array[i][j]+=(-M);

        }

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+"\t");

            }
            System.out.println(" ");
        }

        //1.Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
        int k=2;
        int[]temp=null;
        for (int s=0;s<array.length;s++)
        for (int i=1;i<array.length;i++){
            if(array[i][k]<=array[i-1][k]){
                temp=array[i-1];
                array[i-1]=array[i];
                array[i]=temp;
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+"\t");

            }
            System.out.println(" ");
        }
    }


}
