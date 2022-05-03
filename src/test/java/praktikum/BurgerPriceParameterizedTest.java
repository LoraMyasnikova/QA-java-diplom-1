package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BurgerPriceParameterizedTest {

    private final Bun bun;
    private final Ingredient ingredient;
    private final float expectedPrice;

    public BurgerPriceParameterizedTest(Bun bun, Ingredient ingredient, float expectedPrice) {
        this.bun = bun;
        this.ingredient = ingredient;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getPriceTestData() {
        return new Object[][]{
                {new Bun("Краторная булка N-200i", 1255),
                        new Ingredient(IngredientType.SAUCE, "Соус фирменный Space Sauce", 80),
                        2590},
                {null, new Ingredient(IngredientType.SAUCE, "Соус фирменный Space Sauce", 80), 80},
                {new Bun("Краторная булка N-200i", 1255), null, 2510}
        };
    }

    @Test
    public void getPriceReturnCorrectPrice() throws NullPointerException {
        Burger burger = new Burger();
        float actualResults = 0;

        try {
            burger.setBuns(bun);
            burger.addIngredient(ingredient);
            actualResults = burger.getPrice();
        } catch (Exception exception) {
            System.out.println("Булочка/ингредиент не были выбраны");
        }

        assertEquals(expectedPrice, actualResults, 0.00001);
    }
}