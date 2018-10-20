package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Layer extends JPanel implements ActionListener {
    public Timer t = new Timer(10, this);
    public final int numBer = 20;
    public ArrayList<Shape> layer = new ArrayList<>();

    /**
     * tạo layer
     */
    public Layer(){
        Random random = new Random();
        for(int i=0;i<numBer;i++)
        {
            int j = random.nextInt(4);
            if(j ==0){
                layer.add(new Circle());
            }
            else if(j==1){
                layer.add(new Rectangle());
            }
            else if(j==2) {
                layer.add(new Square());
            }
            else if(j==3){
                layer.add(new Triangle());
            }
        }
    }

    /**
     * tạo hình
     * @param g
     */
    public void paint(Graphics g)
    {
        super.paint(g);
        for(Shape sh : layer)
        {
            if(sh instanceof Circle){
                Circle c = (Circle) sh;
                g.setColor(c.getColor());
                g.fillOval(c.point_temp.getX() , c.point_temp.getY() , c.getRadius() , c.getRadius());
            }
            else if(sh instanceof Rectangle){
                Rectangle re = (Rectangle) sh;
                g.setColor(re.getColor());
                g.fillRect(re.point_temp.getX() , re.point_temp.getY() ,re.getWidth() , re.getHeight());
            }
            else if(sh instanceof Square){
                Square sq = (Square) sh;
                g.setColor(sq.getColor());
                g.fillRect(sq.point_temp.getX() , sq.point_temp.getY() , sq.getSize() , sq.getSize());
            }
            else {
                Triangle tr = (Triangle) sh;
                g.setColor(tr.getColor());
                g.fillPolygon(new int[]{tr.getP1().getX(),tr.getP2().getX(),tr.getP3().getX()} ,
                        new int[]{tr.getP1().getY(),tr.getP2().getY(),tr.getP3().getY()},3);
            }
        }
        t.start();
    }

    /**
     * di chuyển
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        for(Shape sh : layer){
            sh.move();
        }
        repaint();
    }

    /**
     * xóa hình tam giác
     */
    public void removeTriangle(){
        for(int i=0;i<layer.size();i++)
        {
            if(layer.get(i) instanceof Triangle)
            {
                layer.remove(i);
                i--;
            }
        }

    }
    public void removeCircle(){
        for (int i=0;i<layer.size();i++){
            if(layer.get(i) instanceof Circle)
            {
                layer.remove(i);
                i--;
            }
        }

    }
}

