package week4.task1;

/**
 * class QuaCam kế thừa từ lớp HoaQua
 */
public class QuaCam extends HoaQua{
    private String nguonGoc;
    private String loaiCam;

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getLoaiCam() {
        return loaiCam;
    }

    public void setLoaiCam(String loaiCam) {
        this.loaiCam = loaiCam;
    }

    /**
     * phương thức in ra loại cam
     */
    public void gtCam(){
        System.out.println("day la Cam + "+ this.getLoaiCam());
    }

    /**
     * phương thức in ra ngày nhập cam
     */
    public void ngayNhap(){
        System.out.println("ngay nhap hang la :" + this.getDateAdd());
    }

}
