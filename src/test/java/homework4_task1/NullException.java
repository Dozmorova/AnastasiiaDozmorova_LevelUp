package homework4_task1;

public class NullException extends NullPointerException{
    public NullException(String message){
        super(message);
        System.out.println("Исключение NullException");
    }
}
