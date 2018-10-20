package week5_6;

import javax.swing.*;
import java.util.ArrayList;

public class Diagram extends Layer {
    public void removeCircle(){
        for (int i=0;i<layer.size();i++){
            if(layer.get(i) instanceof Circle)
            {
                layer.remove(i);
                i--;
            }
        }

    }
    public static void main(String[] abc){
        JFrame jFrame = new JFrame();
        Layer newLayer = new Layer();
        Diagram d = new Diagram();
        System.out.println("số hình lúc đầu là " + newLayer.layer.size());
       newLayer.removeTriangle();
        newLayer.removeCircle();
        System.out.println("số hình sau khi xóa " + newLayer.layer.size());

        jFrame.add(newLayer);
        jFrame.setVisible(true);
        jFrame.setSize(600 , 600);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
