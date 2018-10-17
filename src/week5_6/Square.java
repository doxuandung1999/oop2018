package week5_6;

import javax.swing.*;
import java.awt.*;
public class Square extends JPanel
{
    /**
     * tọa độ hình
     */
    int x = 300  , y =300;
    int tempX= 1 , tempY = 1;
    public void moving(){
        if (x + tempX < 0) {
            tempX = 1;
        } else if (x + tempX > getWidth() - 50) { //getWith độ rộng của bảng
            tempX = -1;
        } else if (y + tempY < 0) {
            tempY = 1;
        } else if (y + tempY > getHeight() - 50) { // chiều cao của bảng
            tempY = -1;
        }
        x = x + tempX;
        y = y + tempY;
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.blue);
        g.drawRect(x,y,50,50);

    }
}