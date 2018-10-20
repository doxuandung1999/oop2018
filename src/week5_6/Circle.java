package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends Shape{
    private int radius;
    public Circle(){
        Random random = new Random();
        this.radius = random.nextInt(80);
        this.point_temp.setX(random.nextInt(30));
        this.point_temp.setY(random.nextInt(30));
        this.point.setX(random.nextInt(6));
        this.point.setY(random.nextInt(6));
        this.color = new Color(random.nextInt(255) , random.nextInt(255) , random.nextInt(255));

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    @Override
    public void move(){
        super.move();
    }
}


