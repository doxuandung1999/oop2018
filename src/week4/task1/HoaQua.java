package week4.task1;

/**
 * class cha HoaQua
 */
public class HoaQua {
   private double price;
   private String dateAdd;

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * phương thức in ra dòng giới thiệu
     */
    public void introduce(){
        System.out.println("this is fruit");
    }

    /**
     * phương thức in ra ngày nhập hoa quả
     */
    public void day(){
        System.out.println("nhap ngay " + this.getDateAdd());
    }
}
