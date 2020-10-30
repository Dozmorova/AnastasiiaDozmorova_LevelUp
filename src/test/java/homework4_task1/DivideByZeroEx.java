package homework4_task1;

public class DivideByZeroEx extends ArithmeticException{
    public DivideByZeroEx(String message) {
        super(message);
        System.out.println("Исключение DivideByZeroEx");
    }
}
