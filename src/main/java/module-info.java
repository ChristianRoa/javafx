module myproject.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens myproject.javafxproject to javafx.fxml;
    exports myproject.javafxproject;
    exports myproject.javafxproject.controller;
    opens myproject.javafxproject.controller to javafx.fxml;
}