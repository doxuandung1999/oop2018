package week3;

public class Week3 {
    /**
     * chương trình tìm số lớn nhất trong 2 số nguyên
     * @param m
     * @param n
     * @return Số lớn nhất trong 2 số m , n
     */
    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m > n){
            return m;
        }
        else{
            return n;
        }
    }

    /**
     * chương trình tìm giá trị nhỏ nhất của một mảng số nguyên
     * @param array mảng số nguyên
     * @return giá trị nhỏ nhất
     */
    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        int n = array.length;
        for(int i = 0; i < n ; i++)
        {
            if(array[i] < array[0])
            {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight / (height*height);
        if(BMI < 18.5){
            return "Thiếu cân";
        }
        else if(BMI >= 18.5 && BMI <= 22.99){
            return "Bình thường";
        }
        else if(BMI >=23 && BMI <= 24.99){
            return "Thừa cân";
        }
        else {
            return "Béo phì";
        }
    }
}
