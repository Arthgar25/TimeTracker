module com.example.timetracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.timetracker to javafx.fxml;
    exports com.example.timetracker;
}