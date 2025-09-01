public class Q6{
    public static int sumDivisors(int n) {
        int s = 0;
        for (int i=1; i<n; i++) if (n%i==0) s+=i;
        return s;
    }
    public static boolean isPerfect(int n) {
        return sumDivisors(n) == n;
    }
    public static boolean isAbundant(int n) {
        return sumDivisors(n) > n;
    }
    public static boolean isDeficient(int n) {
        return sumDivisors(n) < n;
    }
    public static boolean isStrong(int n) {
        int temp = n, s = 0;
        while (n > 0) {
            int d = n % 10, f = 1;
            for (int i=1; i<=d; i++) f *= i;
            s += f; n /= 10;
        }
        return s == temp;
    }
    public static void main(String[] args) {
        int n = 145;
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}