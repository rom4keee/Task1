package Tsk_2;

import java.awt.Rectangle;

public class SomethingIsWrong {
    public SomethingIsWrong() {
    }

    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.getWidth() + myRect.getHeight());
    }
}