package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public void test1() throws NullPointerException {
        String prt = null;
        try {
            if(prt.equals("abc")){
                System.out.println("giống");
            }
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
    public void test2() throws ArrayIndexOutOfBoundsException{
        String[] str = new String[]{"Do" , "Xuan", "Dung"};
        try {
            System.out.println(str[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    /**
     * ngoại lệ chia 1 số cho 0
     * @throws ArithmeticException
     */
    public void test3()throws ArithmeticException{
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }

    /**
     * ngoại lệ liên quan đến tính năng chuyển đổi kiểu dữ liệu của 1 đối tượng
     * @throws ClassCastException
     */
    public void test4()throws ClassCastException{
        Object a = new String("a");
        try {
            System.out.println((int)a);
        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }

    }
    public void test5()throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\DELL\\IdeaProjects\\dung.txt"));
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
    public void test6()throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\DELL\\IdeaProjects\\doxuandung.txt"));
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
    public static void main(String[] abc)  {
        Task2 task2 = new Task2();
        task2.test1();
        task2.test2();
        task2.test3();
        task2.test4();

        try {
            task2.test5();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        try {
            task2.test6();
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
