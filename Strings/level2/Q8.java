import java.util.Random;

public class Q8 {
    static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages=new int[n];
        for (int i=0; i<n; i++) ages[i] = r.nextInt(90);
        return ages;
    }

    static String[][] checkVote(int[] ages) {
        String[][] res=new String[ages.length][2];
        for (int i=0; i<ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages=generateAges(10);
        String[][] res=checkVote(ages);
        System.out.println("Age\tCanVote");
        for (String[] row:res)
            System.out.println(row[0]+"\t"+row[1]);
    }
}
