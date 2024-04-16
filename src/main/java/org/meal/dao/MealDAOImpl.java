package org.meal.dao;

import org.meal.model.ExistingMeal;
import org.meal.model.Meal;
import org.meal.model.MissingMeal;

public class MealDAOImpl implements MealDAO{

    // if not Meal has found, an especial Meal (MissingMeal) is returned. This way we
    // try not to return null never
    @Override
    public Meal getById(String id) {
        return id.equals("paco")
                ? new ExistingMeal("paco","Chicken", 12D)
                : new MissingMeal();
    }
}
