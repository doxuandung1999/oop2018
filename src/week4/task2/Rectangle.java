package week4.task2;

/**
 * class Rectangle kế thừa từ lớp Shape
 */
public class Rectangle extends Shape {
    private double width;
    private double lenght;
    public Rectangle(){
        this.width = 1.0;
        this.lenght = 1.0;
    }
    public Rectangle(double width , double lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(double width , double lenght , String color , boolean filled){
        this.width = width;
        this.lenght = lenght;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return (this.getLenght()*this.getWidth());
    }
    public double getPerimeter(){
        return (2*(this.getWidth()+this.getLenght()));
    }

    /**
     * phương thức xuất ra thông tin class Rectangle
     * @return color , filled , lenght , width
     */
    public String toString() {
        return super.toString() +","+ this.getLenght()+","+this.getWidth();
    }
}
