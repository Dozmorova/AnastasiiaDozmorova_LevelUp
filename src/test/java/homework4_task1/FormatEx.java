package homework4_task1;

public class FormatEx extends IllegalArgumentException  {
    public FormatEx(String message){
        super(message);
        System.out.println("Исключение FormatEx");
    }
}
