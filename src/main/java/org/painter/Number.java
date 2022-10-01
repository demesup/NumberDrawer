package org.painter;

import lombok.Getter;

@Getter
public enum Number {
    ZERO("""
             @@@@
            @@  @@
            @@  @@
            @@  @@
             @@@@
            """,
            new String[]{
                    " @@@@ ",
                    "@@  @@",
                    "@@  @@",
                    "@@  @@",
                    " @@@@ "},
            0),
    ONE("""
              @@  
             @@@
            @ @@
              @@
            @@@@@@""",
            new String[]{
                    "  @@  ",
                    " @@@  ",
                    "@ @@  ",
                    "  @@  ",
                    "@@@@@@"},
            1),
    TWO("""
             @@@@
            @   @@
               @@
             @@
            @@@@@@""",
            new String[]{
                    " @@@@ ",
                    "@   @@",
                    "   @@ ",
                    " @@   ",
                    "@@@@@@"},
            2),
    THREE("""
             @@@@
            @   @@
               @@
            @   @@
             @@@@""",
            new String[]{
                    " @@@@ ",
                    "@   @@",
                    "   @@ ",
                    "@   @@",
                    " @@@@ "},
            3),
    FOUR("""
               @@
             @@@@
            @@ @@
            @@@@@@
               @@""",
            new String[]{
                    "   @@ ",
                    " @@@@ ",
                    "@@ @@ ",
                    "@@@@@@",
                    "   @@ "},
            4),
    FIVE("""
            @@@@@@
            @@
            @@@@@
                @@
            @@@@@""",
            new String[]{
                    "@@@@@@",
                    "@@    ",
                    "@@@@@ ",
                    "    @@",
                    "@@@@@ "},
            5),
    SIX("""
             @@@@@
            @@
            @@@@@@
            @@  @@
             @@@@""",
            new String[]{
                    " @@@@@",
                    "@@    ",
                    "@@@@@@",
                    "@@  @@",
                    " @@@@ "},
            6),
    SEVEN("""
            @@@@@@
               @@
              @@
             @@
            @@""",
            new String[]{
                    "@@@@@@",
                    "   @@ ",
                    "  @@  ",
                    " @@   ",
                    "@@    "},
            7),
    EIGHT("""
             @@@@
            @@  @@
             @@@@
            @@  @@
             @@@@""",
            new String[]{
                    " @@@@ ",
                    "@@  @@",
                    " @@@@ ",
                    "@@  @@",
                    " @@@@ "},
            8),
    NINE("""
             @@@@
            @@  @@
             @@@@@
                @@
             @@@@""",
            new String[]{
                    " @@@@ ",
                    "@@  @@",
                    " @@@@@",
                    "    @@",
                    " @@@@ "},
            9);
    final String drawing;
    final String[] lines;
    final int number;

    Number(String s, String[] lines, int number) {
        drawing = s;
        this.lines = lines;
        this.number = number;
    }

    static Number byNumber(int number) {
        return Number.values()[number];
    }
}
