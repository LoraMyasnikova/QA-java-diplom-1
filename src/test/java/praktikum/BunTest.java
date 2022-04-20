package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    private final String name = "Bun with sesame seeds";
    private final float price = 10F;

    @Test
    public void testTestGetName() {
        Bun bun = new Bun(name, price);
        String actualResult = bun.getName();

        assertEquals(name, actualResult);
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun(name, price);
        float actualResult = bun.getPrice();

        assertEquals(price, actualResult);
    }
}