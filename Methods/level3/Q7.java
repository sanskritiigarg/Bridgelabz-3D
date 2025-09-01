import java.util.*;

public class Q7 {
    public static int[] factors(int n) {
        int c=0; for (int i=1; i<=n; i++) if (n%i==0) c++;
        int[] f = new int[c]; int idx=0;
        for (int i=1; i<=n; i++) if (n%i==0) f[idx++] = i;
        return f;
    }
    public static int greatestFactor(int n) {
        int[] f = factors(n);
        return f[f.length-1];
    }
    public static int sumFactors(int n) {
        int s=0; for (int x : factors(n)) s+=x; return s;
    }
    public static int productFactors(int n) {
        int p=1; for (int x : factors(n)) p*=x; return p;
    }
    public static double productCubeFactors(int n) {
        double p=1; for (int x : factors(n)) p*=Math.pow(x,3); return p;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println("Factors: " + Arrays.toString(factors(n)));
        System.out.println("Greatest: " + greatestFactor(n));
        System.out.println("Sum: " + sumFactors(n));
        System.out.println("Product: " + productFactors(n));
        System.out.println("Product Cube: " + productCubeFactors(n));
    }
}