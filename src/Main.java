import java.util.Scanner;

public class Main extends Exception {

public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    Calculator calc = new Calculator();
    String basicString;

    while (true) {
        System.out.println("Наберите e (exit), чтобы выйти из Калькулятора.\nУкажите два целых числа и действие над ними\nв формате M+N, M-N, MxN, M/N:");
        basicString = in.next();

        if (basicString.equals("e")) {
            System.out.println("Калькулятор завершил работу");
            break;
        }

        try {
            calc.calcChecker(basicString);
        } catch (ArithmeticException e) {
            System.out.print("Калькулятор перехватил исключение: Деление на нуль!\n\n");
        } catch (NumberFormatException e) {
            System.out.print("Калькулятор перехватил исключение: Одно из введенных чисел либо является не целым числом (или оно слишком велико), либо является строкой\n\n");
        } catch (OperatorException e) {
            System.out.print("Калькулятор перехватил исключение: " + e.getMessage() + "\n\n");
        } catch (Exception e) {
            System.out.print("Калькулятор перехватил исключение: " + e  + "\n\n");
        }
    }
}
}
