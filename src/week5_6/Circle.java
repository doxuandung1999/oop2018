package week5_6;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JPanel {

    /**
     * tọa độ bóng
     */

    int x = 0  , y =0;
    int tempX= 1 , tempY = 1;
    /**
     * phương thức dịch chuyển bóng
     */
    public void move() {
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

        public void paint (Graphics g){
            super.paint(g);
            g.setColor(Color.red);
            g.fillOval(x, y, 50, 50);
        }
    }

