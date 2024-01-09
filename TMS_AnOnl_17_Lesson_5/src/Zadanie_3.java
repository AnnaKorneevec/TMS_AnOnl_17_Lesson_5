//Задание 3. Создать двухмерный массив и вывести сумму всех элементов массива.
public class Zadanie_3 {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 3, 2, 5, 7, 2}, {4, 2, 5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
