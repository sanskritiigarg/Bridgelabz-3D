import java.util.Scanner;

public class Q10 {
    
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        
        return deck;
    }
    
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }
    
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards > deck.length || numCards % numPlayers != 0) {
            return null;
        }
        
        int cardsPerPlayer = numCards / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        
        int cardIndex = 0;
        for (int player = 0; player < numPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                players[player][card] = deck[cardIndex];
                cardIndex++;
            }
        }
        
        return players;
    }
    
    public static void printPlayers(String[][] players) {
        for (int player = 0; player < players.length; player++) {
            System.out.println("Player " + (player + 1) + " cards:");
            for (int card = 0; card < players[player].length; card++) {
                System.out.println("  " + players[player][card]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] deck = initializeDeck();
        System.out.println("Deck initialized with " + deck.length + " cards");
        
        deck = shuffleDeck(deck);
        System.out.println("Deck shuffled");
        
        System.out.print("Enter number of cards to distribute: ");
        int numCards = scanner.nextInt();
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        
        String[][] players = distributeCards(deck, numCards, numPlayers);
        
        if (players != null) {
            System.out.println("\nCards distributed successfully!\n");
            printPlayers(players);
        } else {
            System.out.println("Cannot distribute " + numCards + " cards to " + numPlayers + " players evenly");
        }
        
        scanner.close();
    }
}