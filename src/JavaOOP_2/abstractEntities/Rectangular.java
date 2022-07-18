package JavaOOP_2.abstractEntities;


public abstract class Rectangular implements Shape {
    private final double length;
    private final double width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSquare() {

        return length * width;
    }
}
