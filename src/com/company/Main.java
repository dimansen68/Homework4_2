
package com.company;

public class Main {

    public static void main(String[] args) {
	/*Дан двумерный массив. Задача – написать метод
      public void toLeft() {}
      2.Пройти с 1-го до предпоследнего элемента
     */
        int[][] mas = new int[3][3];
        int i, j, k = 0;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                mas[i][j] = k;
                k++;
            }
        ;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(mas[i][j] + " ");

            ;
            System.out.println("\n");
        }
    }
}

