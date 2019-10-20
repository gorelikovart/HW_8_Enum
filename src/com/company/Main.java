package com.company;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args)
    {
        Utils Utils = new Utils(ColorEnum.RED);
        Utils.print("Hello"); //Просто выводит текст
        Utils Utils1 = new Utils(ColorEnum.CYAN);
        Utils.print("Любой текст", ColorEnum.CYAN); //Выводит текст того цвета, который определим в ColorEnum
    }

    public enum ColorEnum
    {
        BLACK("Черный", 1),
        RED("Красный", 2),
        GREEN("Зеленый", 3),
        YELLOW("Желтый", 4),
        BLUE("Синий", 5),
        PURPLE("Фиолтовый", 6),
        CYAN("Бирюзовый", 7),
        WHITE("Белый", 8);

        public String color;
        public String getColor() {return color;}
        ColorEnum(String color, int x) {this.color = color; this} //x добавил для случайной выборки, но пока не смог реализвать
    }

    public static class Utils
    {
        private String color;
        public Utils(ColorEnum color) {
            this.color = color.getColor();
        }
        public static void print(String text)
        {
            System.out.println(text);
        }
        public static void print(String text, ColorEnum color)
        {
            switch (color)
            {
                case BLACK: System.out.println(ANSI_BLACK + text + ANSI_RESET);
                    break;
                case RED: System.out.println(ANSI_RED + text + ANSI_RESET);
                    break;
                case GREEN: System.out.println(ANSI_GREEN + text + ANSI_RESET);
                    break;
                case YELLOW: System.out.println(ANSI_YELLOW + text + ANSI_RESET);
                    break;
                case BLUE: System.out.println(ANSI_BLUE + text + ANSI_RESET);
                    break;
                case PURPLE: System.out.println(ANSI_PURPLE + text + ANSI_RESET);
                    break;
                case CYAN: System.out.println(ANSI_CYAN + text + ANSI_RESET);
                    break;
                case WHITE: System.out.println(ANSI_WHITE + text + ANSI_RESET);
                    break;
             }
        }
    }
}
