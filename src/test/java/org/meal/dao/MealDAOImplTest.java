package org.meal.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.meal.model.ExistingMeal;
import org.meal.model.MissingMeal;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MealDAOImplTest {

    @InjectMocks
    MealDAOImpl mealDAO;

    @Test
    void should_return_existingMeal_when_idIsEqualToPaco() {
        final var result = mealDAO.getById("paco");

        Assertions.assertThat(result).isInstanceOf(ExistingMeal.class);
    }

    @Test
    void should_return_missingMeal_when_idIsNotEqualToPaco() {
        final var result = mealDAO.getById("pco");

        Assertions.assertThat(result).isInstanceOf(MissingMeal.class);
    }

}