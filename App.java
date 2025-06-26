package com.example.mensajefx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
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
        Controlador control = new Controlador();

    }



}