package week5_6;

import java.awt.*;

/**
 * class tạo màu sắc và cách di chuyển của hình
 */
public class Shape {
    public Color color;
    public Point point_temp = new Point();
    public Point point = new Point();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * phương thúc di chuyển hình
     */
    public void move(){
        if(point_temp.getX() < 0|| point_temp.getX() > 500){
            point.setX(-point.getX());
        }
        if(point_temp.getY() < 0|| point_temp.getY() > 500){
            point.setY(-point.getY());
        }
        point_temp.setX(point_temp.getX() + point.getX());
        point_temp.setY(point_temp.getY()+point.getY());
    }
}
