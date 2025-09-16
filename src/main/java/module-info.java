module com.example.demo_java_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_java_fx to javafx.fxml;
    exports com.example.demo_java_fx;
    exports com.example.demo_java_fx.Controller;
    opens com.example.demo_java_fx.Controller to javafx.fxml;
}