package src.threedimensionalshape;

import java.text.DecimalFormat;

public abstract class ThreeDimensionalShape {
    private static final DecimalFormat TWO_DECIMAL_PLACE_FORMAT = new DecimalFormat("#.##");

    public abstract double getVolume();

    protected double formatToTwoDecimalPlaces(double value) {
        return Double.parseDouble(TWO_DECIMAL_PLACE_FORMAT.format(value));
    }
}
