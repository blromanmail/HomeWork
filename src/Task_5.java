import java.util.Random;
import java.util.Scanner;


public class Task_5 {
    public static void main(String[] args) {
        // Задача 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива n: ");
        int n = scanner.nextInt();
        System.out.print("Введите размерность массива m: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        // Заполнение случайными числами
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(100); // Заполняем случайными числами от 0 до 99
            }
        }

        System.out.print("Введите число для добавления к каждому элементу: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] += number;
                sum += array[i][j];
            }
        }

        System.out.println("Сумма всех элементов: " + sum);

        // Задача 2
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }

        System.out.println("Шахматная доска:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }

        // Задача *
        System.out.print("Введите n для змейки: ");
        int snakeN = scanner.nextInt();
        System.out.print("Введите m для змейки: ");
        int snakeM = scanner.nextInt();

        int[][] snakeArray = new int[snakeN][snakeM];
        int value = 1;
        for (int i = 0; i < snakeN; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < snakeM; j++) {
                    snakeArray[i][j] = value++;
                }
            } else {
                for (int j = snakeM - 1; j >= 0; j--) {
                    snakeArray[i][j] = value++;
                }
            }
        }

        System.out.println("Змейка:");
        for (int i = 0; i < snakeN; i++) {
            for (int j = 0; j < snakeM; j++) {
                System.out.printf("%3d ", snakeArray[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
