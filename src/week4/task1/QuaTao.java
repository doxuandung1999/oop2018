package week4.task1;

/**
 * class QuaTao kế thùa từ lớp HoaQua
 */
public class QuaTao extends HoaQua {
    private double weight;
    private String loaiTao;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLoaiTao() {
        return loaiTao;
    }

    public void setLoaiTao(String loaiTao) {
        this.loaiTao = loaiTao;
    }

    /**
     * phương thúc in ra số lượng táo đã nhập
     */
    public void canNang(){
        System.out.println("so hang nhap la : " + this.weight);
    }

    /**
     * phương thức in ra giá bán 1kg táo
     */
    public void giaTao(){
        System.out.println("gia ban 1kg Tao la : " + this.getPrice());
    }

}
