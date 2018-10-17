package week4.task2;

public class main {
    public static void main(String[] args){
        Shape sh = new Shape();
        System.out.println(sh.toString());
        Circle ci = new Circle();
        System.out.println(ci.toString());
        System.out.println(ci.getPerimeter());
        Rectangle re = new Rectangle();
        System.out.println(re.toString());
        Square sq = new Square();
        System.out.println(sq.toString());
    }
}
