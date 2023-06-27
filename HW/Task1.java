package HW;
//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner inputRead = new Scanner(System.in);
        int n = inputRead.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println(sum);

    }

}
