package week5_6;

import java.awt.*;
import java.util.Random;

/**
 * class Rectangle kế thừa từ class Shape
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
public Rectangle(){
    Random random = new Random();
    this.width = random.nextInt(100);
    this.height = random.nextInt(80);
    this.point_temp.setX(random.nextInt(30));
    this.point_temp.setY(random.nextInt(30));
    this.point.setX(random.nextInt(6));
    this.point.setY(random.nextInt(6));
    this.color = new Color(random.nextInt(255) , random.nextInt(255) , random.nextInt(255));


}
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public void move(){
    super.move();
}
}
