import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" Введите текст нажмите Enter ");

        String text = new Scanner(System.in).nextLine();

        System.out.println(" Длина текста составляет " + text.length ()+" символов ");
    }
}
