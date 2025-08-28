public class Q6 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        int b[] = {6,7,8,9};

        int arr[] = new int[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            arr[k] = a[i];
            k++;
        }

        for (int i = 0; i < b.length; i++) {
            arr[k] = b[i];
            k++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
