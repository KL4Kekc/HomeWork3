package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Курманбек", "Тынчтык", "Айлин"};
        for (String s: names) {
            switch (s) {
                case "Курманбек":
                    System.out.println("Доброе утро " + s);
                    break;
                case "Тынчтык":
                    System.out.println("Добрый день " + s);
                    break;
                case "Айлин":
                    System.out.println("Добрый вечер " + s);
                    break;
            }
        }
    }
}
