package org.meal.model;

public class MissingMeal extends Meal{
    private final static Double price = 15D;

    // MissingMeal is a meal whit
    @Override
    public Double getPrice() {
        return price;
    }
}
