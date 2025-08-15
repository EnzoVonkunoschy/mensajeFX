package com.example.mensajeFX;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        MainView vista = new MainView(stage);
        new MainController(vista);
    }

    public static void main(String[] args) {

        launch(args);
    }




}