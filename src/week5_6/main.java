package week5_6;

import javax.swing.*;

public class main {
    public static void main(String [] abc)throws InterruptedException{
        JFrame jFrame = new JFrame("Moving Ball");
        Circle circle = new Circle();
        Square square = new Square();
        jFrame.add(circle);
        //jFrame.add(square);
       // jFrame.add(circle);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true){
            circle.move();
            circle.repaint();
            square.moving();
            square.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
