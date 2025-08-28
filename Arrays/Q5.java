public class Q5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
