package JavaOOP;

class Vector<S> {
    static double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void createVector(String x) {
    }


    double length(double v) {
        return Math.sqrt(x * x + y * y + z * z);
    }

}

