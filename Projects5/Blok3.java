import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Blok3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
            String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
            for (String city : cities) {
                System.out.println("Ласкаво просимо до міста " + city + "!");
            }
            System.out.println();

            System.out.println("\n");
            double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
            for (int i = 0; i < salaries.length; i++) {
                salaries[i] *= 1.10;
            }
            System.out.println(Arrays.toString(salaries));

            System.out.println("\n\nЗавдання 18: Реверс масиву «на місці» (In-place Reverse)");
            int[] arr = {1, 2, 3, 4, 5, 6};
            System.out.println("До реверсу: " + Arrays.toString(arr));
            for (int i = 0; i < arr.length / 2; i++) {
                int lastIndex = arr.length - 1 - i;
                int temp = arr[i];
                arr[i] = arr[lastIndex];
                arr[lastIndex] = temp;
            }
            System.out.println("Після реверсу: " + Arrays.toString(arr) + "\n\n");

            System.out.println("Завдання 19: Масив квадратів");
            int[] base = {2, 4, 6, 8, 10};
            int[] squares = new int[base.length];
            System.out.println(Arrays.toString(base));
            for (int i = 0; i < base.length; i++) {
                squares[i] = base[i] * base[i];
            }
            System.out.println(Arrays.toString(squares));

            System.out.println("\n\nЗавдання 20: Перевірка відсортованості масиву");
            int[] eror = {1, 2, 4, 8, 9};
            boolean isSorted = true;
            for (int i = 0; i < eror.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            System.out.println("\n\nЗавдання 21: Об'єднання двох масивів (Concatenation)");
            int[] a = {1, 2, 3};
            int[] b = {4, 5, 6, 7};
            int[] c = new int[a.length + b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                c[a.length + i] = b[i];
            }

            System.out.println("\n\nЗавдання 22: Тріо утиліт: toString, sort, fill");
            int[] test = {45, 12, 89, 3, 27};
            System.out.println(Arrays.toString(test));
            Arrays.sort(test);
            System.out.println(Arrays.toString(test));
            Arrays.fill(test, -1);
            System.out.println(Arrays.toString(test));

            System.out.println("\n\nЗавдання 23: Перша таблиця 3 x 3");
            int[][] table = new int[3][3];
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    System.out.print(table[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 24: Розміри прямокутної матриці");
            int[][] matrix = {
                    {10, 20, 30, 40},
                    {50, 60, 70, 80}
            };
            System.out.println(matrix.length);
            System.out.println(matrix[0].length);
            System.out.println(matrix[0][0] + " " + matrix[0][matrix.length - 1] + " " + matrix[matrix.length - 1][0] + " " + matrix[matrix.length - 1][matrix.length - 1]);

            System.out.println("\n\nЗавдання 25: Заповнення матриці порядковими числами");
            int[][] grid = new int[3][4];
            int k = 1;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = k;
                    k++;
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    System.out.print(grid[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 26: Випадкова матриця та deepToString");
            int[][] randomGrid = new int[4][3];
            for (int i = 0; i < randomGrid.length; i++) {
                for (int j = 0; j < randomGrid[i].length; j++) {
                    randomGrid[i][j] = (int) (Math.random() * 90) + 10;
                }
            }
            System.out.println(Arrays.deepToString(randomGrid));
            System.out.println();
            for (int i = 0; i < randomGrid.length; i++) {
                for (int j = 0; j < randomGrid[i].length; j++) {
                    System.out.print(randomGrid[i][j] + "\t");
                }
                System.out.println();


            }
            System.out.println("\n\nЗавдання 27: Таблиця множення Піфагора у 2D-масиві");
            int[][] multTable = new int[9][9];
            for (int i = 0; i < multTable.length; i++) {
                for (int j = 0; j < multTable[i].length; j++) {
                    multTable[i][j] = (i + 1) * (j + 1);
                }
            }
            for (int i = 0; i < multTable.length; i++) {
                for (int j = 0; j < multTable[i].length; j++) {
                    System.out.print(multTable[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("\n\nЗавдання 28: Одинична матриця (Identity Matrix)");
            int[][] tabl = new int[5][5];
            for (int i = 0; i < tabl.length; i++) {
                for (int j = 0; j < tabl[i].length-1; j++) {
                    tabl[i][i]=1;
                }
            }
            for (int i = 0; i < tabl.length; i++) {
                for (int j = 0; j < tabl[i].length; j++) {
                    System.out.print(tabl[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Завдання 29: Модифікація рядка та стовпчика");
            int[][] tab = new int[4][4];
            for (int i = 0; i < tab.length; i++) {
                Arrays.fill(tab[i], 1);
            }
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    System.out.print(tab[i][j] + "\t");
                }
                System.out.println();
            }
            for (int j = 0; j < tab[1].length; j++) {
                tab[1][j] = 0;
            }
            for (int i = 0; i < tab[1].length; i++) {
                tab[i][2] = 7;
            }
            System.out.println();
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    System.out.print(tab[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}