package week3;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Test;

public class Week3Test {
    @Test
    public void Testmax() {

        // TODO: Viết 5 testcase cho phương thức max()
        Assert.assertEquals(5, Week3.max(5, 3));
        Assert.assertEquals(10, Week3.max(2, 10));
        Assert.assertEquals(122, Week3.max(122, 34));
        Assert.assertEquals(99, Week3.max(2, 99));
        Assert.assertEquals(345, Week3.max(215, 345));
    }
        // TODO: Viết 5 testcase cho phương thức minOfArray()

    @Test
    public void TestMinOfArray() {
        int arr_1[] = new int[] {4 , 3 ,5 };
        Assert.assertEquals(3 ,Week3.minOfArray(arr_1));
        int arr_2[] = new int[] {6 , 3 , 7 , 0 , 12 , 6};
        Assert.assertEquals(0 , Week3.minOfArray(arr_2));
        int arr_3[] = new int[] {122 , 99 , 67 , 40 , 12 , 5};
        Assert.assertEquals(5 ,Week3.minOfArray(arr_3));
        int arr_4[] = new int[] {1 , 3 , 5 , 0 , 12 };
        Assert.assertEquals(0 , Week3.minOfArray(arr_4));
        int arr_5[] = new int[] {6 , 13 , 8 , 10 , 2 , 7};
        Assert.assertEquals(2 , Week3.minOfArray(arr_5));
    }


        // TODO: Viết 5 testcase cho phương thức calculateBMI()

    @Test
    public void TestBMI() {
        Assert.assertEquals("Bình thường" , Week3.calculateBMI(52 , 1.65));
        Assert.assertEquals("Thiếu cân" , Week3.calculateBMI(40 , 1.65));
        Assert.assertEquals("Thừa cân" , Week3.calculateBMI(67 , 1.7));
        Assert.assertEquals("Béo phì" , Week3.calculateBMI(100 , 1.7));
        Assert.assertEquals("Bình thường" , Week3.calculateBMI(55 , 1.68));
    }

    

}
