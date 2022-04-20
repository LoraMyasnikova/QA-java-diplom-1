package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private final IngredientType type = IngredientType.SAUCE;
    private final String name = "";
    private final float price = 10F;

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualResult = ingredient.getPrice();

        assertEquals(price, actualResult);
    }

    @Test
    public void testTestGetName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualResult = ingredient.getName();

        assertEquals(name, actualResult);
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualResult = ingredient.getType();

        assertEquals(type, actualResult);
    }
}