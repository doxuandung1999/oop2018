package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
//class 1
public class tamGiac{
    private int canh1;
    private int canh2;
    private  int canh3;

    public void setCanh1(int canh1)
    {
        this.canh1 = canh1;
    }
    public int getCanh1()
    {
        return canh1;
    }
    public void setCanh2(int canh2)
    {
        this.canh2 = canh2;
    }
    public int getCanh2()
    {
        return canh2;
    }
    public void setCanh3(int canh3)
    {
        this.canh3 = canh3;
    }
    public int getCanh3()
    {
        return canh3;
    }
// kiem tra xem 3 canh co hop lai thanh 1 tam giac duoc khong
    public boolean kiemTra(tamGiac t1)
    {
        if(t1.getCanh1()+t1.getCanh2()>t1.getCanh3() ||t1.getCanh1()+t1.getCanh3()>t1.getCanh2()||t1.getCanh3()+t1.getCanh2()>t1.getCanh1())
        {
            return true;
        }
        else
            return false;
    }
    // tinh chu vi tam giac
    public int chuVi(tamGiac t2)
    {
        int p = t2.getCanh1()+t2.getCanh2()+t2.getCanh3();
        return p;
    }
    // tinh chu vi tam giac
    public float dienTich(tamGiac t3)
    {
        float q = chuVi(t3)/2;
        float S = (float) Math.sqrt(q*(q-t3.getCanh1())*(q-t3.getCanh2())*(q-t3.getCanh3()));
        return S;
    }
}

//class 2
public class box{
    private int dai;
    private int rong;
    private int cao;

    public void setDai(int dai)
    {
        this.dai = dai;
    }
    public int getDai()
    {
        return dai;
    }
    public void setRong(int rong)
    {
        this.rong = rong;
    }
    public int getRong()
    {
        return rong;
    }
    public void setCao(int cao)
    {
        this.cao = cao;
    }
    public int getCao()
    {
        return cao;
    }
    // tinh dien tich xung quanh hinh hop
    public int S_xungQuanh(box b1){
        int S_xq = 2*b1.getCao()*(b1.getDai()+b1.getRong());
        return  S_xq;
    }
    // tinh dien tich toan phan hinh hop
    public int S_toanPhan(box b2){
        int S_tp = S_xungQuanh(b2) + 2*b2.getRong()*b2.getDai();
        return S_tp;
    }
    // tinh the tich hinh hop
    public int theTich(box b3){
        int V = b3.getCao()*b3.getDai()*b3.getRong();
        return V;
    }
}

// class 3
public class TongThong{
    private String name;
    private int age;
    private String country;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void sayHello(){
        System.out.println("I am " + this.getName()+"hello everyone");
    }
    public void introduce(){
        System.out.println("this year I am " + this.getAge());
    }
    public void introCountry(){
        System.out.println("My hometown is "+ this.getCountry());
    }
}






