package fundamentals.main;

import fundamentals.classes.ArrayNumbers;
import fundamentals.filter.StringFilter;
import fundamentals.operation.OperationArray;
import fundamentals.reader.InfoReader;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*  Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
            и вывести результат на консоль. */
        String[] strings;
        System.out.println("Enter the numbers: ");
        InfoReader reader = new InfoReader();
        strings = reader.readStringArray(System.in);
        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(strings);
        ArrayNumbers creator = new ArrayNumbers();
        int[] array = creator.factoryArray(strNumbers);
        System.out.println("Filtered array:");
        System.out.println(Arrays.toString(array));
        OperationArray operationArray = new OperationArray();
        int sum = operationArray.sum(array);
        System.out.println(String.format("sum = %d",sum));
        int product = operationArray.multiplication(array);
        System.out.println(String.format("product = %d",product));
    }
}
