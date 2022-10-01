package org.painter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.painter.Painter.painter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = "Enter number to draw or any key/number> 2147483647 to exit";

        while (true) {
            System.out.println(message);
            String input = reader.readLine().replaceAll(" ","");
            if (!Painter.check(input)) break;
            painter(input);
        }
    }

}