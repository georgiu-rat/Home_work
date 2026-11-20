import java.util.Arrays;
import java.util.Scanner;

public class Blok5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            int matrix[][] = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                Arrays.fill(matrix[i], 3);
            }
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                count += matrix[i].length;
            }
            int cer1 = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    cer1 += matrix[i][j];
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            double cer2 = cer1 / count;
            System.out.println("\n" + sum + "\n" + count + "\n" + cer2);

            System.out.println("\n\nЗавдання 31: Сума кожного рядка окремо");
            int matrix1[][] = new int[3][4];
            int matrix2[] = new int[3];
            for (int i = 0; i < matrix1.length; i++) {
                int sum1 = 0;

                for (int j = 0; j < matrix1[i].length; j++) {
                    sum1 += matrix1[i][j];
                }
                matrix2[i] = sum1;
            }
            for (int i = 0; i < matrix2.length; i++) {
                System.out.println("Рядок " + i + ": сума = " + matrix2[i]);
            }

            System.out.println("\n\nЗавдання 32: Сума кожного стовпчика");
            int matrix3[][] = new int[3][3];
            for (int i = 0; i < matrix3.length; i++) {
                Arrays.fill(matrix3[i], 5);
            }
            int[] colSums = new int[3];
            for (int j = 0; j < 3; j++) {
                int col = 0;
                for (int i = 0; i < matrix3.length; i++) {
                    col += matrix3[i][j];
                }
                colSums[j] = col;
            }
            for (int i = 0; i < matrix3.length; i++) {
                for (int j = 0; j < matrix3[i].length; j++) {
                    System.out.print(matrix3[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            for (int j = 0; j < colSums.length; j++) {
                System.out.println("Стовпчик " + j + ": сума = " + colSums[j]);
            }

            System.out.println("\n\nЗавдання 33: Пошук глобального екстремуму в матриці");
            int[][] matrix4 = new int[3][4];
            for (int i = 0; i < matrix4.length; i++) {
                for (int j = 0; j < matrix4[i].length; j++) {
                    matrix4[i][j] = (int) (Math.random() * 101) - 50;
                }
            }
            for (int i = 0; i < matrix4.length; i++) {
                for (int j = 0; j < matrix4[i].length; j++) {
                    System.out.print(matrix4[i][j] + "|\t");
                }
                System.out.println();
            }
            int max=matrix4[0][0];
            int max_x=0;
            int maxy=0;
            for (int i = 0; i < matrix4.length; i++) {
                for (int j = 0; j < matrix4[i].length; j++) {
                    if (matrix4[i][j] > max) {
                        max = matrix4[i][j];
                        max_x = i;
                        maxy = j;
                    }
                }
            }
            System.out.println("Максимум: "+max+" у комірці ["+max_x+", "+maxy+"]");

            System.out.println("\n\nЗавдання 34: Сума головної та побічної діагоналей");
            int[][] matrix5=new int[4][4];
            for (int i = 0; i < matrix5.length; i++) {
                for (int j = 0; j < matrix5[i].length; j++) {
                    matrix5[i][j] = (int) (Math.random() * 11) - 10;
                }
            }
            for (int i = 0; i < matrix4.length; i++) {
                for (int j = 0; j < matrix4[i].length; j++) {
                    System.out.print(matrix4[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println();
            int sum1=0;
            int sum2=0;
            for (int i = 0; i < matrix5.length; i++) {
                for (int j = 0; j < matrix5[i].length; j++) {
                    if (i==j){
                        sum1+=matrix5[i][i];
                    }
                }
            }
            for (int i = 0; i < matrix5.length; i++) {
                for (int j = 0; j < matrix5[i].length; j++) {
                    if (i + j == matrix.length - 1){
                        sum2+=matrix5[i][i];
                    }
                }
            }
            if (sum1>sum2) {
                System.out.println("sum1 > sum2");
            } else if (sum1<sum2) {
                System.out.println("sum1 < sum2");
            } else {
                System.out.println("sum1 = sum2");
            }

            System.out.println("\n\nЗавдання 35: Транспонування квадратної матриці");
            int[][]matrix6=new int[3][3];
            int[][]transposed=new int[matrix6.length][matrix6.length];
            for (int i = 0; i < matrix6.length; i++) {
                for (int j = 0; j < matrix6[i].length; j++) {
                    matrix6[i][j] = (int) (Math.random() * 10) - 20;
                }
            }
            for (int i = 0; i < matrix6.length; i++) {
                for (int j = 0; j < matrix6[i].length; j++) {
                    System.out.print(matrix6[i][j] + " | ");
                }
                System.out.println();
            }
            for (int i = 0; i < transposed.length; i++) {
                for (int j = 0; j < transposed[i].length; j++) {
                    transposed[j][i] = matrix6[i][j];
                }
            }
            System.out.println();
            for (int i = 0; i < transposed.length; i++) {
                for (int j = 0; j < transposed[i].length; j++) {
                    System.out.print(transposed[i][j] + " | ");
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 36: Ступінчастий (зубчастий) масив-сходинки");
            int[][] ladder = new int[4][];
            for (int i = 0; i < ladder.length; i++) {
                ladder[i] = new int[i + 1];
            }
            int count1 = 1;
            for (int i = 0; i < ladder.length; i++) {
                for (int j = 0; j < ladder[i].length; j++) {
                    ladder[i][j] = count1++;
                }
            }
            for (int i = 0; i < ladder.length; i++) {
                for (int j = 0; j < ladder[i].length; j++) {
                    System.out.print(ladder[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 37: Розклад навчальних занять на тиждень");
            String[][] weekSchedule = new String[5][];
            weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
            weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
            weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
            weekSchedule[3] = new String[]{"Дискретна математика"};
            weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};
            String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
            for (int i = 0; i < weekSchedule.length; i++) {
                System.out.println(days[i] + " (" + weekSchedule[i].length + " пари/пара):");
                for (int j = 0; j < weekSchedule[i].length; j++) {
                    System.out.println((j + 1) + ". " + weekSchedule[i][j]);
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 38: Трикутник Паскаля (перші 5 рядків)");
            int[][] pascal = new int[5][];
            for (int i = 0; i < pascal.length; i++) {
                pascal[i] = new int[i + 1];
                for (int j = 0; j < pascal[i].length; j++) {
                    if (j == 0 || j == i) {
                        pascal[i][j] = 1;
                    } else {
                        pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    }
                }
            }
            for (int i = 0; i < pascal.length; i++) {
                for (int j = 0; j < pascal[i].length; j++) {
                    System.out.print(pascal[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 39: Тривимірний масив: Просторова сітка 3 x 3 x 3");
            int[][][] cube = new int[3][3][3];
            for (int x = 0; x < cube.length; x++) {
                for (int y = 0; y < cube[x].length; y++) {
                    for (int z = 0; z < cube[x][y].length; z++) {
                        cube[x][y][z] = x + y + z;

                    }
                }
            }
            for (int x = 0; x < cube.length; x++) {
                System.out.println("--- Шар " + x + " ---");

                for (int y = 0; y < cube[x].length; y++) {
                    for (int z = 0; z < cube[x][y].length; z++) {
                        System.out.print(cube[x][y][z] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }

            System.out.println("\n\nЗавдання 40: Метеорологічний куб (3 міста x 7 днів x 2 заміри)");
            double[][][] weather = new double[3][7][2];

            String[] cities = {"Київ", "Львів", "Одеса"};
            String[] days1 = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Нд"};
            double[][][] weather1 = {
                    { {15.5, 7.0}, {14.0, 6.5}, {13.0, 5.0}, {14.5, 6.0}, {15.0, 7.5}, {16.0, 8.0}, {13.5, 5.5} },
                    { {13.0, 5.0}, {12.5, 4.0}, {14.0, 6.0}, {13.5, 4.5}, {12.0, 5.0}, {15.0, 7.0}, {11.5, 3.5} },
                    { {18.0, 10.5}, {19.0, 11.0}, {17.5, 9.5}, {16.5, 9.0}, {18.5, 10.0}, {19.5, 12.0}, {17.0, 10.0} }
            };
            double minNight = weather[0][0][1]; // [1] означає НІЧ
            int minCityIdx = 0;
            int minDayIdx = 0;
            for (int c = 0; c < weather.length; c++) {
                for (int d = 0; d < weather[c].length; d++) {
                    if (weather[c][d][1] < minNight) {
                        minNight = weather[c][d][1];
                        minCityIdx = c;
                        minDayIdx = d;
                    }
                }
            }
            System.out.println("--- Найхолодніша ніч за тиждень ---");
            System.out.printf("Температура: %.1f°C (Місто: %s, День: %s)%n",
                    minNight, cities[minCityIdx], days[minDayIdx]);
        }
    }
}
