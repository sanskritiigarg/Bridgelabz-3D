import java.util.*;

public class Q7 {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        Q7 q = new Q7();
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println(q.canStudentVote(ages[i]));
        }
    }
}