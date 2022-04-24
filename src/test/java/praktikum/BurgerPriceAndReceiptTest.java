package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerPriceAndReceiptTest {

    Burger burger = new Burger();
    private final float expectedPrice = 30F;
    private final float bunPrice = 10F;
    private final float ingredientPrice = 10F;

    private final String expectedBunName = "black bun";
    private final String expectedIngredientName = "cutlet";
    private final IngredientType expectedIngredientType = IngredientType.FILLING;
    private final String expectedReceipt = String.format("(==== %s ====)%n", expectedBunName) +
            String.format("= %s %s =%n", expectedIngredientType.toString().toLowerCase(), expectedIngredientName) +
            String.format("(==== %s ====)%n", expectedBunName) +
            String.format("%nPrice: %f%n", expectedPrice);

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Before
    public void setUp() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
    }

    @Test
    public void getPriceReturnCorrectPrice() {
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
        Mockito.when(ingredient.getPrice()).thenReturn(ingredientPrice);
        float actualResults = burger.getPrice();

        assertEquals(expectedPrice, actualResults, 0.00001);
    }

    @Test
    public void getReceiptReturnCorrectReceipt() {
        Mockito.when(bun.getName()).thenReturn(expectedBunName);
        Mockito.when(ingredient.getType()).thenReturn(expectedIngredientType);
        Mockito.when(ingredient.getName()).thenReturn(expectedIngredientName);
        Mockito.when(burger.getPrice()).thenReturn(expectedPrice);

        String actualResult = burger.getReceipt();

        assertEquals(actualResult, expectedReceipt);
    }
}