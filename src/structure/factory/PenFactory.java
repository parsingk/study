package structure.factory;

import structure.colors.Color;
import structure.official.pens.materials.Inks.Ink;
import structure.official.pens.materials.Plastics.Plastic;
import structure.official.pens.materials.leads.Lead;

/**
 * Created by parkjp on 2017-01-24.
 */
public class PenFactory implements Factory{

    @Override
    public Ink Ink(Color color) {
        return new Ink(color);
    }

    @Override
    public Lead Lead(double thickness) {
        return new Lead(thickness);
    }

    @Override
    public Plastic Plastic(Color color) {
        return new Plastic(color);
    }
}
