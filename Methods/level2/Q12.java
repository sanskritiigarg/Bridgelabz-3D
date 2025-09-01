import java.util.*;

public class Q12 {
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int x : numbers) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new double[]{(double)sum / numbers.length, min, max};
    }
    public static void main(String[] args) {
        Q12 q = new Q12();
        int[] arr = q.generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(q.findAverageMinMax(arr)));
    }
}