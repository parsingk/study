package structure.factory;

import structure.colors.Color;
import structure.official.pens.materials.Inks.Ink;
import structure.official.pens.materials.Plastics.Plastic;
import structure.official.pens.materials.leads.Lead;

/**
 * Created by parkjp on 2017-01-24.
 */
interface Factory {

    public Ink Ink(Color color);
    public Lead Lead(double thickness);
    public Plastic Plastic(Color color);
}
