package com.company.code;

import java.util.Scanner;

class HelpClass {
    String userInput(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write " + string + " json here");
        String input = scanner.nextLine();
        while (input == null || input.equals("")) {
            System.out.println("Empty input is not allowed here!" + "\n" + "Please write json again:");
            input = scanner.nextLine();
        }
        while (!input.startsWith("{") || !input.endsWith("}")) {
            System.out.println("Wrong json format" + "\n" + "Please write json again:");
            input = scanner.nextLine();
        }
        return input;
    }

    String cutIt(String string) {
        return string.substring(string.indexOf('{'), string.lastIndexOf('}'));
    }

}
