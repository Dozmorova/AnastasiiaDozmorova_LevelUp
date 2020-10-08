package homework_2.task_1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator appCalculator = new Calculator();
        appCalculator.startApplicationCalculator();
    }

    public void startApplicationCalculator() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - возведение в степень, 5 - вычисление факториала, 6 - вычисление числа Фибоначчи");
        int operation = in.nextInt();

        if (operation == 5 || operation == 6) {

            System.out.println("Введите число ");
            int num = in.nextInt();

            switch (operation) {
                case 5:
                    getFactorial(num);
                    break;

                case 6:
                    getFibonachi(num);
                    break;
            }
        }
        else {
            System.out.println("Введите первое число ");
            double num1 = in.nextDouble();

            System.out.println("Введите второе число ");
            double num2 = in.nextDouble();

            switch (operation) {
                case 1:
                    getAddition(num1, num2);
                    break;

                case 2:
                    getSubtraction(num1, num2);
                    break;

                case 3:
                    getMultiplication(num1, num2);
                    break;

                case 4:
                    getExponentiation((int) num1, (int) num2);
                    break;
            }

        }
    }

    private void getAddition(double a, double b) {
        double additionResult = a + b;
        System.out.println(a + " + " + b + " = " + additionResult);
    }

    private void getSubtraction(double a, double b) {
        double subtractionResult = a - b;
        System.out.println(a + " - " + b + " = " + subtractionResult);
    }

    private void getMultiplication(double a, double b) {
        double multiplicationResult = a * b;
        System.out.println(a + " * " + b + " = " + multiplicationResult);
    }

    private void getExponentiation(int num, int power) {
        int exponentiationResult = 1;
        for (int i = 1; i <= power; i++) {
            exponentiationResult =  exponentiationResult * num;
        }
        System.out.println(num + " в степени " + power + " равно " + exponentiationResult);
    }

    private void getFactorial(int num) {
        int factorialResult = 1;
        for (int i = 1; i <= num; i++) {
            factorialResult = factorialResult * i;
        }
        System.out.println("Факториал " + num + " равен " + factorialResult);
    }

    private void getFibonachi(int num) {
        int num0 = 0;
        int num1 = 1;
        for (int i = 2; i <= num; ++i) {
            int nextValue = num0 + num1;
            num0 = num1;
            num1 = nextValue;
        }
        if (num == 0)
            System.out.println("Значение числа Фибоначчи: " + num0);
        else
            System.out.println("Значение числа Фибоначчи: " + num1);
    }
}

