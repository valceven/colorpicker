module com.example.javafxprac {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxprac to javafx.fxml;
    exports com.example.javafxprac;
}