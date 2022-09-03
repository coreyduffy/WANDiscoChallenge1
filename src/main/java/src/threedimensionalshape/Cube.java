package src.threedimensionalshape;

class Cube extends ThreeDimensionalShape {

    private final int width;

    Cube(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Cube cannot have a negative width");
        }
        this.width = width;
    }

    @Override
    public double getVolume() {
        double volume = Math.pow(width, 3);
        return formatToTwoDecimalPlaces(volume);
    }
}
