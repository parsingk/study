package structure.official.pens;

import structure.colors.Color;
import structure.factory.PenFactory;
import structure.official.pens.materials.Inks.Ink;
import structure.official.pens.materials.Plastics.Plastic;
import structure.official.pens.materials.leads.Lead;

/**
 * Created by parkjp on 2017-01-24.
 */
public abstract class Pen {

    protected Ink ink;
    protected Lead lead;
    protected Plastic plastic;

    public void written() {
        int amount = ink.getAmount();
        ink.setAmount(amount-1);
    }

    public void drawn() {
        int amount = ink.getAmount();
        ink.setAmount(amount-2);
    }

    public Color getInkColor() {
        return ink.getColor();
    }

    protected abstract void createPen(Color inkColor, double thickness, Color plasticColor);
}
