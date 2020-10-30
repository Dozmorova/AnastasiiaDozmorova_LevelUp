package homework3_ChiefCook;

import homework3_ChiefCook.products.*;
import homework3_ChiefCook.dinner.*;

public class ChiefCook {
    public static void main(String[] args) {
        Soup borscht = new Borscht(300, 400, 200, 150, 100, 50);
        cookSoup(borscht);
        System.out.println("**************************");
        calculationCalories(borscht);
        System.out.println("**************************");
        Products[] setProductsForSalad = new Products[]{new Bow(50), new Carrot(150),
                new Cucumber(200), new Tomato(200)};
        sortVegetablesForSaladByCalories(setProductsForSalad);
        System.out.println("**************************");
        findProductIn(borscht);


    }

    public static void cookSoup(Soup borscht) {
        borscht.cook();
    }

    public static void calculationCalories(Soup soup) {
        Products[] productsSoup = soup.getSetProducts();
        double summCalories = 0;
        for (Products product : productsSoup) {
            summCalories += product.getSummCaloriesInProduct();

        }

        System.out.println(soup.getName() + " содержит " + summCalories  + " калорий" );
    }


    public static void sortVegetablesForSaladByCalories(Products[] setProductsForSalad) {

        for (int i = 1; i < setProductsForSalad.length; i++) {
            boolean state = true;

            for (int j = 0; j < setProductsForSalad.length - i; j++) {
                if (setProductsForSalad[j].getSummCaloriesInProduct() > setProductsForSalad[j + 1].getSummCaloriesInProduct()) {
                    Products tempElement = setProductsForSalad[j];
                    setProductsForSalad[j] = setProductsForSalad[j + 1];
                    setProductsForSalad[j + 1] = tempElement;
                    state = false;
                }
            }

            if (state == true)
                break;

            System.out.println("Продукты для салата по возрастанию калорийности: ");
            for (Products productsSalad : setProductsForSalad) {
                System.out.println(productsSalad.getName() + " " + productsSalad.getSummCaloriesInProduct() + " калорий");
            }
        }

    }

    public static void findProductIn(Soup soup){
        System.out.println("Найдём в борще продукты, которые весят больше 200 грамм, при этом красного, розового или фиолетового цвета:" );
        Products[] productsSoup = soup.getSetProducts();
        for (Products product : productsSoup) {
            if (product.getWeightInGrams() > 200 && ("Красный".equals(product.getColor()) || "Розовый".equals(product.getColor())) ||
                    "Фиолетовый".equals(product.getColor()))
                System.out.println(product.getName() + " " + product.getWeightInGrams() + " грамм. " + product.getColor() + " цвет");
        }
    }

}

