package week2.task1;

public class Task1 {


    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n >= 2) {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
        return 0;
    }

}
