public class Q2 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int n) {
        for (int d : toDigits(n)) if (d == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n) {
        int[] d = toDigits(n);
        int p = d.length, s = 0;
        for (int x : d) s += Math.pow(x, p);
        return s == n;
    }
    public static void largestTwo(int n) {
        int[] d = toDigits(n);
        int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > l1) { l2 = l1; l1 = x; }
            else if (x > l2 && x != l1) l2 = x;
        }
        System.out.println("Largest: " + l1 + " Second Largest: " + l2);
    }
    public static void smallestTwo(int n) {
        int[] d = toDigits(n);
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < s1) { s2 = s1; s1 = x; }
            else if (x < s2 && x != s1) s2 = x;
        }
        System.out.println("Smallest: " + s1 + " Second Smallest: " + s2);
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Digits: " + countDigits(n));
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        largestTwo(n);
        smallestTwo(n);
    }
}