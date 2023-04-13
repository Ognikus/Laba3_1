package com.example.laba3_1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private Button btn_clear;
    @FXML
    private URL location;

    @FXML
    private Button btn_task1;

    @FXML
    private Button btn_task10;

    @FXML
    private Button btn_task11;

    @FXML
    private Button btn_task12;

    @FXML
    private Button btn_task13;

    @FXML
    private Button btn_task2;

    @FXML
    private Button btn_task3;

    @FXML
    private Button btn_task4;

    @FXML
    private Button btn_task5;

    @FXML
    private Button btn_task6;

    @FXML
    private Button btn_task7;

    @FXML
    private Button btn_task8;

    @FXML
    private Button btn_task9;

    @FXML
    private TextField signUpInputText;

    @FXML
    private TextArea signUpOutputText;

    @FXML
    void initialize() {

        btn_task1.setOnAction(actionEvent -> {
            String inputString = signUpInputText.getText();
            String regex = "^abcdefghijklmnopqrstuv18340$";
            if (inputString.matches(regex)) {
                signUpOutputText.setText("Входная строка соответствует шаблону");
            } else {
                signUpOutputText.setText("Входная строка не соответствует шаблону");
            }
        });

        btn_task2.setOnAction(actionEvent -> {
            String regex = "^(\\{)?[a-fA-F0-9]{8}\\-[a-fA-F0-9]{4}\\-[a-fA-F0-9]{4}\\-[a-fA-F0-9]{4}\\-[a-fA-F0-9]{12}(\\})?$";
            String inputString = signUpInputText.getText();

            if (inputString.matches(regex)) {
                signUpOutputText.setText("Входная строка соответствует шаблону РУКОВОДСТВА.");
            } else {
                signUpOutputText.setText("Входная строка не соответствует шаблону РУКОВОДСТВА.");
            }

        });

        btn_task3.setOnAction(actionEvent -> {
            String regex = "^([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]{2}$";
            String inputString = signUpInputText.getText();
            if (inputString.matches(regex)) {
                signUpOutputText.setText("Вводимая строка соответствует шаблону MAC-адреса.");
            } else {
                signUpOutputText.setText("Вводимая строка не соответствует шаблону MAC-адреса.");
            }
        });

        btn_task4.setOnAction(actionEvent -> {
            String urlRegex = "^https?://(?:[-\\w]+\\.)+[a-z]{2,}$";
            String url = signUpInputText.getText();
            if (url.matches(urlRegex)) {
                signUpOutputText.setText("URL верный");
            } else {
                signUpOutputText.setText("URL не верный");
            }
        });

        btn_task5.setOnAction(actionEvent -> {
            String colorRegex = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";
            String color = signUpInputText.getText();
            if (color.matches(colorRegex)) {
                signUpOutputText.setText("Цвет верный");
            } else {
                signUpOutputText.setText("Цвет неверный");
            }
        });

        btn_task6.setOnAction(actionEvent -> {
            String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:1[6-9]|[2-9]\\d)(?:0[48]|[2468][048]|[13579][26])|(?:16|[2468][048]|[3579][26])00))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
            String date = signUpInputText.getText();
            if (date.matches(dateRegex)) {
                signUpOutputText.setText("Дата верна");
            } else {
                signUpOutputText.setText("Дата не верна");
            }
        });

        btn_task7.setOnAction(actionEvent -> {
            String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            String email = signUpInputText.getText();
            if (email.matches(regex)) {
                signUpOutputText.setText("Верный email адрес");
            } else {
                signUpOutputText.setText("Неверный email адрес");
            }
        });

        btn_task8.setOnAction(actionEvent -> {
            String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
            String ipAddress = signUpInputText.getText();
            if (ipAddress.matches(regex)) {
                signUpOutputText.setText("Верный IP адрес");
            } else {
                signUpOutputText.setText("Неверный IP адрес");
            }
        });

        btn_task9.setOnAction(actionEvent -> {
            String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
            String password = signUpInputText.getText();
            if (password.matches(regex)) {
                signUpOutputText.setText("Сильный пароль");
            } else {
                signUpOutputText.setText("Слабый пароль");
            }
        });

        btn_task10.setOnAction(actionEvent -> {
            String input = signUpInputText.getText();
            boolean isValid = input.matches("^[1-9]\\d{5}$");
            if (isValid) {
                signUpOutputText.setText("Шестизначное число");
            } else {
                signUpOutputText.setText("Не шестизначное число");
            }
        });

        btn_task11.setOnAction(actionEvent -> {
            String text = signUpInputText.getText();
            int count = 0;
            String regex = "\\d+[.]\\d{2}\\s(USD|EU|RUR)";
            Pattern p1 = Pattern.compile(regex);
            Matcher m1 = p1.matcher(text);
            while (m1.find()) {
                count ++;
                String outputText = ("Список цен: " + m1.group() + '\n');
                signUpOutputText.appendText(outputText);
            }
            if (count==0) {
                signUpOutputText.setText("СОВПАДЕНИЙ НЕ НАЙДЕНО");
            }
//            Pattern pattern = Pattern.compile("(\\d+\\.\\d+)\\s+(\\p{Alpha}{3})");
//            Matcher matcher = pattern.matcher(text);
//
//            while (matcher.find()) {
//                String price = matcher.group(1);
//                String currency = matcher.group(2);
//                String outputText = "Price: " + price + " " + currency + "\n";
//                signUpOutputText.appendText(outputText);
//            }
        });

        btn_task12.setOnAction(actionEvent -> {
            String text = signUpInputText.getText();
            Pattern pattern = Pattern.compile("(?<!\\+)\\d+"); // Находит где не стоит +
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String outputText = "Найденный номер: " + matcher.group() + '\n';
                signUpOutputText.appendText(outputText);
            }
        });

        btn_task13.setOnAction(actionEvent -> {
            String expressions = signUpInputText.getText();
            String reg = "\\(";
            String obreg = "\\)";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern .matcher(expressions);
            Pattern pattern2 = Pattern.compile(obreg);
            Matcher matcher2 = pattern2.matcher(expressions);

            int g = 0;
            int g2 = 0;
            while (matcher.find()){
                g = g + 1;
            }
            while (matcher2.find()){
                g2 = g2 + 1;
            }
            if (g2 == g) {
                signUpOutputText.setText("Допустимое выражение: " + expressions + '\n');
            }
            else {
                signUpOutputText.setText("Недопустимое выражение: " + expressions + '\n');
            }

//            Pattern pattern = Pattern.compile("^\\((?:[^()]|(?))*\\)$");
//
//            Matcher matcher = pattern.matcher(expressions);
//            if (matcher.matches()) {
//                signUpOutputText.setText("Допустимое выражение: " + expressions + '\n');
//            }
//            else {
//                signUpOutputText.setText("Недопустимое выражение: " + expressions + '\n');
//            }
        });

        btn_clear.setOnAction(actionEvent -> {
            signUpOutputText.clear();
        });
    }

}
