import java.util.Scanner;

public class Q7 {
    static int[] trimIndexes(String text) {
        int start=0,end=text.length()-1;
        while (start<text.length() && text.charAt(start)==' ') start++;
        while (end>=0 && text.charAt(end)==' ') end--;
        return new int[]{start,end};
    }

    static String substring(String text,int s,int e) {
        String res = "";
        for (int i=s;i<=e;i++) res+=text.charAt(i);
        return res;
    }

    static boolean compare(String a,String b) {
        if (a.length()!=b.length()) return false;
        for (int i=0;i<a.length();i++)
            if (a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] idx = trimIndexes(text);
        String trimmed = substring(text,idx[0],idx[1]);
        String builtin = text.trim();
        System.out.println("Equal: "+compare(trimmed,builtin));
    }
}
