package Kap7_eksempel;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;     //initialize the cards


        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length); //섞어서 랜덤으로 나오는 카드
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
            for (int j = 0; j < 4; j++) {
               int cardnumber = (int)(Math.random() * deck.length);
                String suit1 = suits[cardnumber / 13];
                String rank1 = ranks[cardnumber % 13];
                System.out.println("Card number " + cardnumber + " : " +
                        rank1 + " of " + suit1);

            }
    }
}
