package org.meal.service;

import org.meal.dao.MealDAO;

public class CalculateMealPriceImpl implements CalculateMealPrice{
    private final MealDAO mealDAO;

    public CalculateMealPriceImpl(MealDAO mealDAO) {
        this.mealDAO = mealDAO;
    }

    @Override
    public Double calculateMealPrice(String idMeal) {
        // DAO return always a Meal subclass, never null or empty optional
        return mealDAO.getById(idMeal).getPrice();
    }
}
