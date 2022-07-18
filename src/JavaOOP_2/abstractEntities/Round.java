package JavaOOP_2.abstractEntities;

public abstract class Round implements Shape {
    private final double majorAxis;
    private final double minorAxis;

    public Round(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double getSquare() {

        return Math.PI * majorAxis * minorAxis;
    }
}