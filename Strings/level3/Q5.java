import java.util.Scanner;

public class Q5 {
    
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (text.charAt(i) == temp[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count] = text.charAt(i);
                count++;
            }
        }
        
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }
        
        return unique;
    }
    
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[][] result = findFrequency(text);
        
        System.out.println("Character frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ": " + result[i][1]);
        }
        
        scanner.close();
    }
}