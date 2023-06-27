package HW;
//3) Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inputRead = new Scanner(System.in);
        int n1;
        int n2;
        int result;
        char oper;

        System.out.print("Введите первое число: ");
        n1 = inputRead.nextInt();
        System.out.print("Выберете операцию: +, - , * , / ");
        oper = inputRead.next().charAt(0);
        System.out.print("Введите второе число: ");
        n2 = inputRead.nextInt();
        boolean correct = true;

        switch (oper) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                result = 0;
                correct = false;
        }
        System.out.println(correct ? "Итого: " + result : "Неверная операция!");
    }
}
