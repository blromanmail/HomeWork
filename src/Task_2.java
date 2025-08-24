import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задача 1
        System.out.print("Ввод числа ");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Это четное число");
        } else {
            System.out.println("Это нечетное число");
        }
        //Задача 2
        System.out.print("Ввод температуры: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t >= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        //Задача 3
        System.out.println("Вывод квадратов чисел от 10 до 20");
        for (int y = 10; y <= 20; y++) {
            System.out.println(y * y);
        }
        //Задача 4
        int z = 7;
        while (z <= 98) {
            System.out.println(z);
            z += 7;
        }
        //Задача 5
        System.out.print("Ввод целого положительного числа: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a > 0) {
                    int sum = 0;
                    for (int b = 1; b <= a; b++) {
                        sum += b;
                    }
                    System.out.println("Сумма чисел от 1 до " + a + " =  " + sum);
                    break;
                } else{
                    System.out.println("Введите положительное число");
                }
            } else {
                System.out.println("Введите целое число");
                scanner.next();

            }
        }
        scanner.close();
    }
}