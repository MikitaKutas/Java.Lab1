/**
 Ввести с консоли n целых чисел. На консоль вывести:
 Отсортированные числа в порядке возрастания и убывания
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества чисел
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        // Создание массива для хранения чисел
        int[] numbers = new int[n];

        // Ввод чисел
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Сортировка массива
        Arrays.sort(numbers);

        // Вывод отсортированных чисел в порядке возрастания
        System.out.println("Отсортированные числа в порядке возрастания:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Вывод отсортированных чисел в порядке убывания
        System.out.println("\nОтсортированные числа в порядке убывания:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
