package JavaOOP;

import java.util.Scanner;

class dotProduct
{
    static double result(double x1, double y1, double z1, double x2, double y2, double z2)
    {
        return Math.sqrt((x1*x2) + (y1*y2) + (z1*z2));
    }

    public static void main(String[] args)
    {
        double x1, x2, y1, y2, z1, z2;
        double result;

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the x1: ");
        x1 = scan.nextDouble();

        System.out.println("Enter the x2: ");
        x2 = scan.nextDouble();

        System.out.println("Enter the y1: ");
        y1 = scan.nextDouble();

        System.out.println("Enter the y2: ");
        y2 = scan.nextDouble();

        System.out.println("Enter the z1: ");
        z1 = scan.nextDouble();

        System.out.println("Enter the z2: ");
        z2 = scan.nextDouble();

        result = result(x1,x2,y1,y2,z1,z2);
        System.out.println("Result: " + result + " .");
    }
}
