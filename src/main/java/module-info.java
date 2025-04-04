module org.example.demofxformulario {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.demofxformulario to javafx.fxml;
    exports org.example.demofxformulario;

}