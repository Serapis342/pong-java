module com.serapis.pongjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.serapis.pongjavafx to javafx.fxml;
    exports com.serapis.pongjavafx;
}