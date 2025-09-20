package org.example.array_ex;

public class ArrayExample {
    public static void main(String[] args) {
        /**
         * int[] - тип данных
         * array - название переменной
         * new int[4] - выделяется память под наш массив в 4 элемента
         * размер всегда нужно задавать, это нединамический массив
         */
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        System.out.println("------------");

        int[][] dimensionalArray = new int[4][4];
        for (int i = 0; i < dimensionalArray.length; i++) {
            for (int j = 0; j < dimensionalArray[i].length; j++) {
                dimensionalArray[i][j] = i;
                System.out.print(dimensionalArray[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
