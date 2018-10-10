package week4.task1;

/**
 * class CamSanh kế thừa từ lớp QuaCam
 */
public class CamSanh extends QuaCam{
    private String viCam;
    private String xuatKhau;

    public String getViCam() {
        return viCam;
    }

    public void setViCam(String viCam) {
        this.viCam = viCam;
    }

    public String getXuatKhau() {
        return xuatKhau;
    }

    public void setXuatKhau(String xuatKhau) {
        this.xuatKhau = xuatKhau;
    }

    /**
     * phương thức in ra vị cam
     */
    public void vicam(){
        System.out.println("cam co vi : "+ this.getViCam());
    }

    /**
     * phương thức in ra nguồn gốc của cam
     */
    public void nhaptu(){
        System.out.println("so hang nhap " + this.getNguonGoc());
    }
}
