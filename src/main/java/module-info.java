module com.example.cashbackhacker1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cashbackhacker1 to javafx.fxml;
    exports com.example.cashbackhacker1;
}