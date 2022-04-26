package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseTest {

    @Mock
    Database database;

    @Test
    public void availableBunsTest() {
        List<Bun> buns = new ArrayList<>();
        Mockito.when(database.availableBuns()).thenReturn(buns);
        List<Bun> actualResult = database.availableBuns();
        assertEquals(actualResult, buns);
    }

    @Test
    public void availableIngredientsTest() {
        List<Ingredient> ingredients = new ArrayList<>();
        Mockito.when(database.availableIngredients()).thenReturn(ingredients);
        List<Ingredient> actualResult = database.availableIngredients();
        assertEquals(actualResult, ingredients);
    }
}