package org.painter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.painter.Painter.painter;


public class Main {
    static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        userDecision();

        System.out.println("Good bye ^^");
    }

    private static void userDecision() throws IOException {
        String message = "Enter number to draw (<=2147483647)";
        try {
            while (true) {
                System.out.println(message);
                String input = READER.readLine().replaceAll(" ", "");
                painter(input);
            }
        } catch (RuntimeException e) {
            System.out.println(e + "\nDo you want to exit? Enter yes/press any key");
            if (!READER.readLine().equalsIgnoreCase("yes")) userDecision();
        }

    }

}