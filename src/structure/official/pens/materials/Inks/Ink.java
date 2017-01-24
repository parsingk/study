package structure.official.pens.materials.Inks;

import structure.colors.Color;

/**
 * Created by parkjp on 2017-01-24.
 */
public class Ink {

    private Color color;
    private int amount;

    public Ink(Color color) {
        this.amount = 100;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}