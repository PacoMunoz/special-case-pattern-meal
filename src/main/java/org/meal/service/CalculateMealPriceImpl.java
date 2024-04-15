package org.meal.service;

import org.meal.dao.MealDAO;

public class CalculateMealPriceImpl implements CalculateMealPrice{
    private static final Double DEFAULT_MEAL_PRICE = 15D;

    private final MealDAO mealDAO;

    public CalculateMealPriceImpl(MealDAO mealDAO) {
        this.mealDAO = mealDAO;
    }

    @Override
    public Double calculateMealPrice(String idMeal) {
        final var meal = mealDAO.getById(idMeal).orElse(null);
        return meal != null ? meal.getPrice() : DEFAULT_MEAL_PRICE;
    }
}
