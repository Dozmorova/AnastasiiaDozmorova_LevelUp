package homework3_ChiefCook.dinner;

import homework3_ChiefCook.CookDinner;
import homework3_ChiefCook.products.Products;

public class Soup implements CookDinner {
    private String name;
    private Products[] setProducts;

    public Soup(Products[] setProducts){
        this.setProducts = setProducts;
    }

    public Products[] getSetProducts() {
        return setProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cook() {
        System.out.println("Готовим суп - варим бульон, начинаем добавлять подготовленные ингредиенты:");
        for (Products product : this.setProducts) {
            System.out.println(product.getName() + " " + product.getWeightInGrams() + " грамм" + " добавлено");
        }
        System.out.println("Варим...");
        System.out.println("Суп готов");
    }
}
