package JavaOOP;

import java.util.Scanner;

class JavaOOP_1 {
    private double x;
    private double y;
    private double z;

    public void Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public static void main(String arg[])

    {

        int x, y, z;

        double dis;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x:");

        x=sc.nextInt();

        System.out.println("Enter y:");

        y=sc.nextInt();

        System.out.println("Enter z:");

        z=sc.nextInt();


        dis=Math.sqrt((x*x) + (y*y) + (z*z));

        System.out.println("Lenght is:" +dis);
    }


}


