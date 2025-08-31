import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Выберите способ заполнения массива: ");
        System.out.println("1 - Math.random()");
        System.out.println("2 - Ввод вручную");
        int choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100); // Заполняем случайными числами от 0 до 99
            }
        } else {
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Массив: " + Arrays.toString(array));

        // Задача 1: Вывод элементов в прямом и обратном порядке
        System.out.println("Элементы в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Элементы в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Задача 2: Найти минимальный и максимальный элементы
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        // Задача 3: Найти индексы минимального и максимального элементов
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);

        // Задача 4: Найти и вывести количество нулевых элементов
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевые элементы отсутствуют");
        }

        // Задача 5: Поменять местами элементы
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("Массив после обмена: " + Arrays.toString(array));

        // Задача 6: Проверить, является ли массив возрастающей последовательностью
        boolean isAscending = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                isAscending = false;
                break;
            }
        }
        if (isAscending) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }

        // Задача *: Добавить единицу к "числу", представленному массивом
        int[] inputArray = {1, 4, 0, 5, 6, 3};
        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        int[] result = plusOne(inputArray);
        System.out.println("Результат: " + Arrays.toString(result));

        int[] inputArray2 = {9, 9, 9};
        System.out.println("Исходный массив: " + Arrays.toString(inputArray2));
        int[] result2 = plusOne(inputArray2);
        System.out.println("Результат: " + Arrays.toString(result2));

        scanner.close();
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}

