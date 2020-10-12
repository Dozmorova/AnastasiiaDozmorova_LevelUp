package homework3_ChiefCook.products;

public class Products {
    private String name;
    private String color;
    private double weightInGrams;
    private double calories; //в 100 граммах
    private double summCaloriesInProduct;

    public Products (double weightInGrams){
        this.weightInGrams = weightInGrams;
    }

    public double getSummCaloriesInProduct() {
        return summCaloriesInProduct = weightInGrams/100 * calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
