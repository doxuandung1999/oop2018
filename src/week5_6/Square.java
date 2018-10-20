package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * class Square kế thừa từ class Shape
 */
public class Square extends Shape{
    private int size;
    public Square(){
        Random random = new Random();
        this.size = random.nextInt(70);
        this.point_temp.setX(random.nextInt(30));
        this.point_temp.setY(random.nextInt(30));
        this.point.setX(random.nextInt(6));
        this.point.setY(random.nextInt(6));
        this.color = new Color(random.nextInt(255) , random.nextInt(255) , random.nextInt(255));

    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    @Override
    public void move(){
        super.move();
    }
}
