package week5_6;

import java.awt.*;
import java.util.Random;

/**
 * class Triangle kế thừa từ class Shape
 */
public class Triangle extends Shape {
    private Point p1 = new Point();
    private Point p2 = new Point();
    private Point p3 = new Point();

    public Triangle(){
        Random random = new Random();
        this.p1.setX(random.nextInt(15));
        this.p1.setY(random.nextInt(15));
        this.p2.setX(random.nextInt(55));
        this.p2.setY(random.nextInt(55));
        this.p3.setX(random.nextInt(95));
        this.p3.setY(random.nextInt(95));
        this.point.setX(random.nextInt(6));
        this.point.setY(random.nextInt(6));
        this.color = new Color(random.nextInt(255) , random.nextInt(255) , random.nextInt(255));

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
}
