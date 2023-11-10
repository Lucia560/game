module com.example.game.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.game.game to javafx.fxml;
    exports com.example.game.game;
}