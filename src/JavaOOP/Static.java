package JavaOOP;

import java.util.ArrayList;

public class Static {

    public static void main (String[] args)
    {
        ArrayList<Integer> Vector = new ArrayList<Integer>();
        Vector.add(10);
        Vector.add(15);
        Vector.add(20);
        Vector.add(25);
        Vector.add(0);
        Vector.add(5);
        Vector.add(40);
        Vector.add(45);
        Vector.add(50);
        for (int i : Vector){
            System.out.println(i);
        }

    }

}

