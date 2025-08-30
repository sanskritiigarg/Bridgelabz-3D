import java.util.Scanner;

public class Q4 {
    public static char[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[][] result = new char[text.length()][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = c;
                result[index][1] = (char) (freq[c]);
                freq[c] = 0;
                index++;
            }
        }
        char[][] finalResult = new char[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[][] freqArr = frequency(text);
        for (int i = 0; i < freqArr.length; i++) {
            System.out.println(freqArr[i][0] + " : " + (int) freqArr[i][1]);
        }
    }
}
