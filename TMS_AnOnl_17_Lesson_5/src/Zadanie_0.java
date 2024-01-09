import java.util.Scanner;
//Задача 0. Создать трехмерный массив, пройтись и увеличить каждый элемент на заданное число из консоли.
public class Zadanie_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][][] array = new int[][][]{{
                {1, 5, 2}, {4, 5, 4}, {3, 2, 2}},
                {{2, 6, 2}, {2, 7, 2}, {3, 3, 3}},
                {{3, 2, 6}, {1, 1, 1}, {3, 2, 2}}};
        System.out.println("Укажите число для увеличения массива");
        int number = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    }
