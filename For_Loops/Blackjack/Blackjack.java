package com.pbd.blackjack;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class BlackJack {
    static Random random = new Random();
    static Scanner keyboard = new Scanner(System.in);

    public static void start() {
        boolean game = true;

        String input;
        int playerDraw1, playerDraw2;
        int dealerDraw1, dealerDraw2;
        int playerTotal, dealerTotal;
        int maxDraw = 11;


        while (game) {
            playerDraw1 = draw(maxDraw);
            playerDraw2 = draw(maxDraw);
            dealerDraw1 = draw(maxDraw);
            dealerDraw2 = draw(maxDraw);

            playerTotal = playerDraw1 + playerDraw2;
            dealerTotal = dealerDraw1 + dealerDraw2;


            String selectCard = getFaceCard();

            playercheck_value(playerDraw1, playerDraw2, playerTotal, selectCard);
            dealer_play(dealerDraw1, dealerDraw2, selectCard);
            playerTotal = player_hit(playerDraw1, maxDraw, playerTotal,selectCard);
            if (playerTotal <= 21) {
                dealercheck_value(dealerDraw2, dealerTotal, selectCard);
                dealerTotal = dealer_hit(dealerDraw1, maxDraw, dealerTotal, selectCard);
                check_winner(playerTotal, dealerTotal);
            }

            if(play_again()) {
                game = true;
            } else {
                game = false;
            }
        }
    }

    public static void main(String[] args) {
        start();
    }

    private static void check_winner(int player_total, int dealer_total){
        if (dealer_total > 21) {
            System.out.println("The dealer bust! You win!");
        } else if (player_total > dealer_total) {
            System.out.println("You win!");
        } else if (player_total == dealer_total) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("The dealer wins!");
        }
    }

    private static void playercheck_value(int draw1, int draw2, int total, String face_card) {
        if (draw1 == 10 && draw2 == 10 ) {
            System.out.println("You draw " + face_card + " and a " + face_card);
        } else if (draw1 == 10) {
            System.out.println("You draw a " + face_card + " and a " + draw2);
        } else if (draw1 == 10) {
            System.out.println("You draw a " + draw1 + " and a " + face_card);
        } else {
            System.out.println("You draw " + draw1 + " and a " + draw2);
        }

        System.out.println("Your total is " + total);
     }

    private static void dealercheck_value(int draw2, int total, String face_card) {
        if (draw2 == 10) {
            System.out.println("The dealer shows the hidden card, it's a " + face_card);
        } else {
            System.out.println("The dealer shows the hidden card, it's a " + draw2);
        }
        System.out.println("His total is " + total);
    }

    private static void dealer_play(int draw1, int draw2, String face_card) {
        int dealerTotal = draw1 + draw2;

        if (draw1 == 10) {
            System.out.println("\nThe dealer draws " + face_card + " and a hidden card");
        } else {
            System.out.println("\nThe dealer draws " + draw1 + " and a hidden card.");
        }
        System.out.println("The dealer total is hidden as well.");
    }

    private static int player_hit(int draw1, int maxDraw, int total ,String face_card) {
        String input;

        System.out.println("\nWanna hit or stay?");
        input = get_string_input();

        while (!input.equalsIgnoreCase("stay")) {
            if (input.equalsIgnoreCase("hit")) {
                draw1 = draw(maxDraw);
                if (draw1 == 10) {
                    System.out.println("You draw a " + face_card);
                } else {
                    System.out.println("You draw a " + draw1);
                }

                total += draw1;
                System.out.println("Your total is " + total);

                if (total <= 21) {
                    System.out.println("\nWanna hit or stay?");
                    input = get_string_input();
                } else {
                    System.out.println("You bust! The dealer wins.");
                    break;
                }
            } else {
                System.out.println("\nI don't understand your input.");
                System.out.println("\nWanna hit or stay?");
                input = get_string_input();
            }
        }
        return total;
    }

    private static int dealer_hit(int draw1, int maxDraw, int total, String face_card) {
        while (total <= 16) {
            System.out.println("\nThe dealer decides to hit.");
            draw1 = draw(maxDraw);
            if (draw1 == 10) {
                System.out.println("He draws a " + face_card);
            } else {
                System.out.println("He draws a " + draw1 );
            }
            total += draw1;
            System.out.println("His total is " + total);
        }
        return total;
    }

    private static String getFaceCard() {
        Random random = new Random();

        List<String> faceCards = Arrays.asList("Jack", "Queen", "King");
        String selectCard = faceCards.get(random.nextInt(faceCards.size()));

        return selectCard;
    }

    private static int draw(int max){int number = random.nextInt(max); return number;}

    private static boolean play_again() {
        display_message("Would you like to play again? ");
        boolean play_again = false;

        String choice = get_string_input();

        while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
            System.out.println("I don't understand your input");
            display_message("Would you like to play again? ");
            choice = get_string_input();
        }


        if (choice.equals("yes")) {
            play_again = true;
        } else {
            System.out.println("Thanks for playing!");
        }

        return play_again;
    }

    private static String get_string_input() {
        String input;
        input = keyboard.next();
        return input;
    }

    private static void display_message(String message) {
        System.out.println(message);
    }
}
