package org.meal.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.meal.dao.MealDAO;
import org.meal.model.MissingMeal;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculateMealPriceImplTest {

    @InjectMocks
    private CalculateMealPriceImpl calculateMealPrice;

    @Mock
    private MealDAO mealDAO;

    @Test
    void should_beOk_when_calculateMealPrice() {
        final var idMeal = "Paco";
        final var missingMeal = new MissingMeal();
        BDDMockito.given(mealDAO.getById(idMeal)).willReturn(missingMeal);

        final var result = calculateMealPrice.calculateMealPrice(idMeal);

        Assertions.assertThat(result).isEqualTo(missingMeal.getPrice());

    }
}