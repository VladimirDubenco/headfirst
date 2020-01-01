/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

/**
 *
 * @author PC
 */
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//
//    }

    public void startGame() {
        p1 = new Player(); //create player 1
        p2 = new Player(); //create player 2
        p3 = new Player(); //create player 3

        int guessp1; //initialize guessed number of player#
        int guessp2; //initialize guessed number of player#
        int guessp3; //initialize guessed number of player#

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        while (true) {

            System.out.println("Computer guess number... ");
            int targetNumber = (int) (Math.random() * 10);   //computer roll
            System.out.println("You need guess number   " + targetNumber);

            p1.guess();  //player roll
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("First player think number is: " + guessp1);
            p2.guess();
            guessp2 = p2.number;
            System.out.println("Second player think number is: " + guessp2);
            p3.guess();
            guessp3 = p3.number;
            System.out.println("Third player think number is: " + guessp3);

            //check
            if (p1.number == targetNumber) {
                p1isRight = true;
            }
            if (p2.number == targetNumber) {
                p2isRight = true;
            }
            if (p3.number == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner ");
                System.out.println("The first player is winner ? " + p1isRight);
                System.out.println("The first player is winner ? " + p2isRight);
                System.out.println("The first player is winner ? " + p3isRight);
                System.out.println("Game over");
                break;
            } else {
                System.out.println("Nobody guess the number, rolling again");
                
            }
        }

    }

}
