public class Q1 {
    public static void main(String[] args) {
        int arr[] = {1,2,34,5,2,4,2,};
        int k = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) count++;
        }

        System.out.println(count);
    }
};
