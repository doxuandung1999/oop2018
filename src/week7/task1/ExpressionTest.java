package week7.task1;

public class ExpressionTest {
    public static void main(String[] abc){
        Numeral ten = new Numeral(10);
        Numeral one = new Numeral(1);
        Numeral two = new Numeral(2);
        Numeral three = new Numeral(3);
        Square ten_2 = new Square(ten);
        Subtraction tru = new Subtraction(ten_2 , one);
        Multiplication nhan = new Multiplication(two , three);
        Addition cong = new Addition(tru , nhan);
        Square result = new Square(cong);
        System.out.println(result.evaluate());

        try {

            System.out.println(5/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }


    }
}
