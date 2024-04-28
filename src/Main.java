/**
 Ввести с консоли n целых чисел. На консоль вывести:
 Числа, которые делятся на 3 или на 9
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество чисел
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        // Создаем массив для хранения чисел
        int[] numbers = new int[n];

        // Вводим числа
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Выводим числа, которые делятся на 3 или на 9
        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int number : numbers) {
            if (number % 3 == 0 || number % 9 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}