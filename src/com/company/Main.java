
package com.company;

public class Main {

    public static void main(String[] args) {
	/*Дан двумерный массив. Задача – написать метод
      public void toLeft() {}
      2.Пройти с 1-го до предпоследнего элемента
     */
        int[][] mas = {{1, 2, 3}, {1}, {1, 2, 3, 4, 5}, {2, 4, 6, 7}};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                System.out.print(mas[i][j] + " ");
            System.out.println();
        }
    }
}


