module com.example.laba3_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba3_1 to javafx.fxml;
    exports com.example.laba3_1;
}