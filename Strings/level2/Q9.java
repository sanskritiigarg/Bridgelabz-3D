import java.util.Scanner;

public class Q9 {
    static String getComputerChoice() {
        int n=(int)(Math.random()*3);
        return n==0 ? "rock" : n==1 ? "paper" : "scissors";
    }

    static int findWinner(String user,String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock")&&comp.equals("scissors"))||
            (user.equals("paper")&&comp.equals("rock"))||
            (user.equals("scissors")&&comp.equals("paper"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        int userWins = 0, compWins = 0;
        for (int i = 0; i<n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = getComputerChoice();
            int res = findWinner(user,comp);
            if (res==1) userWins++;
            else if (res==-1) compWins++;
            System.out.println("User: "+ user +" | Comp: "+comp);
        }
        System.out.println("User wins: "+ userWins);
        System.out.println("Comp wins: "+ compWins);
        System.out.println("User win%: "+ (userWins*100.0/n));
        System.out.println("Comp win%: "+ (compWins*100.0/n));
    }
}
