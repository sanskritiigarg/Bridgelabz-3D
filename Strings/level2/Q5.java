import java.util.Scanner;

public class Q5 {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    static int[] countVowelsConsonants(String text) {
        int v=0,c=0;
        for (int i=0;i<text.length();i++) {
            char ch=text.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] res = countVowelsConsonants(text);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}
