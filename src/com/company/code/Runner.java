package com.company.code;

public class Runner {
    private HelpClass helpClass = new HelpClass();

    public void run() {
        String json1 = helpClass.userInput("first");
        String json2 = helpClass.userInput("second");

        json1 = helpClass.cutIt(json1);
        json2 = helpClass.cutIt(json2);

        String[] arr1 = json1.split(", ");
        String[] arr2 = json2.split(", ");

        boolean check = false;
        if (arr1.length == arr2.length) {
            for (int i = 0, j = 0; i < arr1.length; i++, j++) {
                if (!arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                    System.out.println(arr2[j]);
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Jsons are equals.");
            }
        } else {
            System.out.println("Jsons lengths are not equals. Please verify your input.");
        }
    }
}
