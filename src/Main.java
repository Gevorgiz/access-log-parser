import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число, нажмите Enter ");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число,нажмите Enter ");
        int secondNumber = new Scanner(System.in).nextInt();

        System.out.println("____________________________________________");
        // Вывод в консоль суммы введенных чисел
        int quotient = firstNumber + secondNumber;
        System.out.println(quotient  + " сумма чисел ");

        // Вывод в консоль разность введенных чисел

        int quotient1 = firstNumber - secondNumber;
        System.out.println(quotient1   + " разность чисел ");

        // Вывод в консоль произведение введенных чисел

        int quotient2 = firstNumber * secondNumber;
        System.out.println(quotient2    + " произведение чисел ");

        // Вывод в консоль частное введенных чисел

        double quotient3 = (double)   firstNumber / secondNumber;
        System.out.println(quotient3   + " частное чисел ");

    }
}