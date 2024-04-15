package org.meal.dao;

import org.meal.model.Meal;

import java.util.Optional;

public interface MealDAO {
    Optional<Meal> getById(String id);
}
