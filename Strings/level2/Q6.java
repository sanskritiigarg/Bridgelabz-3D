import java.util.Scanner;

public class Q6 {
    static String checkChar(char c) {
        if (Character.isLetter(c)) {
            c = Character.toLowerCase(c);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] classifyChars(String text) {
        String[][] res = new String[text.length()][2];
        
        for (int i=0; i<text.length(); i++) {
            res[i][0] = String.valueOf(text.charAt(i));
            res[i][1] = checkChar(text.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] arr = classifyChars(text);
        for (String[] row: arr)
            System.out.println(row[0]+"\t"+row[1]);
    }
}
