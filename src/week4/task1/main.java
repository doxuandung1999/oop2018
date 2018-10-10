package week4.task1;

public class main {
    public static void main(String[] abc){
        HoaQua hq = new HoaQua();
        QuaTao qt = new QuaTao();
        QuaCam qc = new QuaCam();
        CamCaoPhong ccp = new CamCaoPhong();
        CamSanh cs = new CamSanh();
        hq.setDateAdd("08-10");
        hq.introduce();
        hq.day();
        System.out.println("-----------");
        qt.setWeight(20);
        qt.canNang();
        qt.setPrice(20);
        qt.giaTao();
        System.out.println("-----------");
        qc.setLoaiCam("cam binh thuong");
        qc.gtCam();
        qc.setDateAdd("09-10");
        qc.ngayNhap();
        System.out.println("-----------");
        ccp.setHangLoai(1);
        ccp.chatluong();
        ccp.setNguonGoc("Nam Dinh");
        ccp.nguonGocCamCP();
        System.out.println("-----------");
        cs.setViCam("ngot");
        cs.vicam();
        cs.setNguonGoc("Nam Dinh");
        cs.nhaptu();
    }
}
