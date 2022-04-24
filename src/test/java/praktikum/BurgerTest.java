package praktikum;

<<<<<<< HEAD
=======
import org.junit.Before;
>>>>>>> origin/develop1
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    Bun bun;
    Ingredient ingredient;

    private final int ingredientIndexToRemove = 0;
    private final int ingredientIndexMoveFrom = 0;
    private final int ingredientIndexMoveTo = 1;
    private final float expectedPrice = 20F;
    private final String expectedReceipt = "This is expected receipt";

    @Mock
    Burger burger;

<<<<<<< HEAD
=======
    @Before
    public void setUp() {
    }

>>>>>>> origin/develop1
    @Test
    public void setBuns() {
        burger.setBuns(bun);
        Mockito.verify(burger).setBuns(bun);
    }

    @Test
    public void addIngredient() {
        burger.addIngredient(ingredient);
        Mockito.verify(burger).addIngredient(ingredient);
    }

    @Test
    public void removeIngredient() {
        burger.removeIngredient(ingredientIndexToRemove);
        Mockito.verify(burger).removeIngredient(ingredientIndexToRemove);
    }

    @Test
    public void moveIngredient() {
        burger.moveIngredient(ingredientIndexMoveFrom, ingredientIndexMoveTo);
        Mockito.verify(burger).moveIngredient(ingredientIndexMoveFrom, ingredientIndexMoveTo);
    }

    @Test
    public void getPrice() {
        Mockito.when(burger.getPrice()).thenReturn(20F);
        float actualResults = burger.getPrice();
        assertEquals(expectedPrice, actualResults, 0.001F);
    }

    @Test
    public void getReceipt() {
        Mockito.when(burger.getReceipt()).thenReturn(expectedReceipt);
        String actualResult = burger.getReceipt();
        assertEquals(actualResult, expectedReceipt);
    }
}