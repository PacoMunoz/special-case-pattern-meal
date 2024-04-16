package org.meal.dao;

import org.meal.model.ExistingMeal;
import org.meal.model.Meal;

import java.util.Optional;

public interface MealDAO {
    Meal getById(String id);
}
