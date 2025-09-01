import java.util.*;

public class Q4 {
    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static int[] reverse(int[] arr) {
        int[] rev = arr.clone();
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int t = rev[i]; rev[i] = rev[j]; rev[j] = t;
        }
        return rev;
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    public static boolean isPalindrome(int n) {
        int[] d = toDigits(n);
        return arraysEqual(d, reverse(d));
    }
    public static boolean isDuck(int n) {
        for (int x : toDigits(n)) if (x == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 121;
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Duck: " + isDuck(n));
    }
}