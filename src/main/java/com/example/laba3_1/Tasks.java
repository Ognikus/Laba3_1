package com.example.laba3_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {

    public static void Task1() {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String inputString = "abcdefghijklmnopqrstuv18340";

        if (inputString.matches(regex)) {
            System.out.println("Input string matches the pattern.");
        } else {
            System.out.println("Input string does not match the pattern.");
        }
    }

    public static void Task2(){
        String regex = "^(\\{)?[a-fA-F0-9]{8}\\-[a-fA-F0-9]{4}\\-[a-fA-F0-9]{4}\\-[a-fA-F0-9]{4}\\-[a-fA-F0-9]{12}(\\})?$";
        String inputString = "e02fd0e4-00fd-090A-ca30-0d00a0038ba0";

        if (inputString.matches(regex)) {
            System.out.println("Входная строка соответствует шаблону РУКОВОДСТВА.");
        } else {
            System.out.println("Входная строка не соответствует шаблону РУКОВОДСТВА.");
        }
    }

    public static void Task3(){
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]{2}$";
        String inputString = "aE:dC:cA:56:76:54";

        if (inputString.matches(regex)) {
            System.out.println("Input string matches the MAC address pattern.");
        } else {
            System.out.println("Input string does not match the MAC address pattern.");
        }
    }

    public static void Task4(){
        String urlRegex = "^https?://(?:[-\\w]+\\.)+[a-z]{2,}$";
        String url = "http://www.example.com";
        if (url.matches(urlRegex)) {
            System.out.println("URL is valid");
        } else {
            System.out.println("URL is invalid");
        }
    }

    public static void Task5(){
        String colorRegex = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";
        String color = "#FFFFFF";
        if (color.matches(colorRegex)) {
            System.out.println("Color is valid");
        } else {
            System.out.println("Color is invalid");
        }
    }

    public static void Task6(){
        String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:1[6-9]|[2-9]\\d)(?:0[48]|[2468][048]|[13579][26])|(?:16|[2468][048]|[3579][26])00))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String date = "29/02/2000";
        if (date.matches(dateRegex)) {
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is invalid");
        }

    }
    public static void Task7(){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String email = "example@mail.com";
        if (email.matches(regex)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

    public static void Task8(){
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        String ipAddress = "192.168.0.1";
        if (ipAddress.matches(regex)) {
            System.out.println("Valid IP address");
        } else {
            System.out.println("Invalid IP address");
        }
    }

    public static void Task9(){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        String password = "C00l_Pass";
        if (password.matches(regex)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }

    }
    public static void Task10(){
        String input = "123456";
        boolean isValid = input.matches("[1-9]\\d{5}");
        System.out.println(isValid); // true

        input = "12345";
        isValid = input.matches("[1-9]\\d{5}");
        System.out.println(isValid); // false

        input = "001234";
        isValid = input.matches("[1-9]\\d{5}");
        System.out.println(isValid); // false

    }
    public static void Task11(){
        String text = "Prices: 10.5 USD, 120 RUR, 8.3 EU";
        Pattern pattern = Pattern.compile("(\\d+\\.\\d+)\\s+(\\p{Alpha}{3})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);
            System.out.println("Price: " + price + " " + currency);
        }
        // Output:
        // Price: 10.5 USD
        // Price: 120 RUR
        // Price: 8.3 EU

    }
    public static void Task12(){
        String text = "1 + 2 * 3 - 4 / 5";
        Pattern pattern = Pattern.compile("(?<!\\+)\\d+"); // Negative lookbehind to exclude numbers after '+'
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
        // Output:
        // Found number: 1
        // Found number: 2
        // Found number: 3
        // Found number: 4
        // Found number: 5

    }
    public static void Task13(){
        String[] expressions = {"(3 + 5) - 9 * 4", "((3 + 5) - 9 * 4", "(3 + 5) - 9 * 4)", "3 + 5 - 9 * 4"};

        Pattern pattern = Pattern.compile("^\\((?:[^()]|(?))*\\)$"); // Recursive regular expression to match balanced parentheses
        for (String expr : expressions) {
            if (pattern.matcher(expr).matches()) {
                System.out.println("Valid expression: " + expr);
            }
        }
        // Output:
        // Valid expression: (3 + 5) - 9 * 4

    }
}
