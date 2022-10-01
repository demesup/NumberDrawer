package org.painter;

import java.util.List;
import java.util.stream.IntStream;

import static org.painter.Number.byNumber;


public class Painter {

    private final String number;

    private Painter(String number) {
        this.number = String.valueOf(number);
        paint();
    }

    private void paint() {
        List<Number> numbers = getNumbers();
        System.out.println(getStringNumber(numbers));
    }

    private static String getStringNumber(List<Number> numbers) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, 5).forEach(i -> {
            for (Number n : numbers) {
                builder.append(n.lines[i]).append("\s");
            }
            builder.append("\n");
        });
        return String.valueOf(builder);
    }

    private List<Number> getNumbers() {
        return IntStream.range(0, number.length())
                .mapToObj(j -> number.substring(j, j + 1))
                .map(n -> byNumber(Integer.parseInt(n))).toList();
    }

    public static void painter(String number) {
        if (check(number)){
            new Painter(number);
        } else throw new RuntimeException("Cannot draw " + number);
    }

    public static boolean check(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
