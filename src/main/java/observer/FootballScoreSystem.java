/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author ittak
 */
public class FootballScoreSystem {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        // Register observers
        ScoreDisplay display1 = new ScoreDisplay();
        ScoreDisplay display2 = new ScoreDisplay();
        scoreBoard.registerObserver(display1);
        scoreBoard.registerObserver(display2);

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            scoreBoard.setScore(input);
        }

        scanner.close();
    }
}