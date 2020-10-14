package homework4_task1;

import homework3_ChiefCook.dinner.*;
import homework3_ChiefCook.products.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling appExceptionHandling = new ExceptionHandling();
        appExceptionHandling.startNullEx();
        appExceptionHandling.startFormatEx();
        appExceptionHandling.startDivideByZeroEx();
    }

    public void startNullEx(){
        Soup borscht = null;
        if (borscht == null)
            throw new NullException("Ничего не переданно в суп");
    }

    public void startFormatEx(){
        Meat meat = new Meat(-50);
        if (meat.getWeightInGrams()<0)
            throw new FormatEx("Вес не может быть отрицательным");

    }

    public void startDivideByZeroEx(){
        double piece = 0;
        Meat meat = new Meat(50);
        double weightMeat = meat.getWeightInGrams();
        double pieceOfMeat = weightMeat/piece;
        if (piece == 0)
            throw  new DivideByZeroEx("Нельзя делить на ноль");

    }
}
