module com.example.demosandprototypes {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.demosandprototypes to javafx.fxml;
    exports com.example.demosandprototypes;
}