package structure.official.pens;

import structure.colors.Color;
import structure.factory.PenFactory;

/**
 * Created by parkjp on 2017-01-24.
 */
public class LuxuryPen extends Pen{

    private PenFactory penFactory;

    public LuxuryPen() {
        this.penFactory = new PenFactory();
    }

    @Override
    protected void createPen(Color inkColor, double thickness, Color plasticColor) {
        ink = penFactory.Ink(inkColor);
        lead = penFactory.Lead(thickness);
        plastic = penFactory.Plastic(plasticColor);
    }
}
