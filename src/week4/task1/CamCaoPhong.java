package week4.task1;

/**
 * class CamCaoPhong kế thùa từ lớp QuaCam
 */
public class CamCaoPhong extends QuaCam{
    private int hangLoai;
    private String hanSuDung;

    public int getHangLoai() {
        return hangLoai;
    }

    public void setHangLoai(int hangLoai) {
        this.hangLoai = hangLoai;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    /**
     * phương thức in ra chất lượng của cam
     */
    public void chatluong(){
        System.out.println("Cam cao phong hang loai : "+ this.getHangLoai());
    }

    /**
     * phương thức in ra nguồn gốc của cam
     */
    public void nguonGocCamCP(){
        System.out.println("hang nhap tu : " + this.getNguonGoc());
    }
}
