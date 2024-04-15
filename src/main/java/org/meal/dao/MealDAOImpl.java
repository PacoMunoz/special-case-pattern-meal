package org.meal.dao;

import org.meal.model.Meal;

import java.util.Optional;

public class MealDAOImpl implements MealDAO{
    @Override
    public Optional<Meal> getById(String id) {
        return id.equals("paco")
                ? Optional.of(new Meal("paco","Chicken", 12D))
                : Optional.empty();
    }
}
