module com.pplab7.pplab7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pplab7.pplab7 to javafx.fxml;
    exports com.pplab7.pplab7;
}