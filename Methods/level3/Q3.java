public class Q3 {
    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static int sumDigits(int n) {
        int s = 0; for (int x : toDigits(n)) s += x; return s;
    }
    public static int sumSquares(int n) {
        int s = 0; for (int x : toDigits(n)) s += Math.pow(x,2); return s;
    }
    public static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }
    public static void digitFrequency(int n) {
        int[] d = toDigits(n);
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++) f[i][0] = i;
        for (int x : d) f[x][1]++;
        for (int[] row : f) if (row[1] > 0) System.out.println(row[0] + " -> " + row[1]);
    }
    public static void main(String[] args) {
        int n = 21;
        System.out.println("Sum digits: " + sumDigits(n));
        System.out.println("Sum squares: " + sumSquares(n));
        System.out.println("Harshad: " + isHarshad(n));
        digitFrequency(n);
    }
}