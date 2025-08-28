public class Q2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp; 
            i++; j--;
        }

        for (int k =0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        
    }
}