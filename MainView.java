/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectop2;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.TextField;

public class MainView {
    private Label  label;
    private Button button;
    private VBox   layout;
    private Scene  scene;
    
    private TextField destinatario;
    private TextField remitente;
    private TextField texto;
    
    private Label mDestinatario;
    private Label mRemitente;
    private Label mTexto;
   

    public MainView(Stage stage) {
        label         = new Label("Bienvenido a JavaFX sin FXML");
        button        = new Button("Presionar");
        destinatario  = new TextField();
        remitente     = new TextField();
        texto         = new TextField();
        mDestinatario = new Label("Destinatario: ");
        mRemitente    = new Label("Remitente: ");
        mTexto        = new Label("Texto: ");
        
        layout = new VBox(10);
        
        layout.getChildren().addAll(label, destinatario, remitente, texto,
                button, mDestinatario, mRemitente, mTexto);

        scene = new Scene(layout, 400, 300);

        stage.setTitle("JavaFX sin FXML");
        stage.setScene(scene);
        stage.show();
    }

    public Button getButton() {
        return button;
    }

    public Label getLabel() {
        return label;
    }
    
    public TextField getDestinatario(){
        return destinatario;
    }
    
    public TextField getRemitente(){
        return remitente;
    }
    
    public TextField getTexto(){
        return texto;
    }
    
    public void setMensaje(Mensaje men){
        mDestinatario.setText("Destinatario: "+men.destinatario);
        mRemitente.setText(   "   Remitente: "+men.remitente);
        mTexto.setText(       "       Texto: "+men.texto);
    }
    
    public Label getMDestinatario(){
        return mDestinatario;
    }
    
    public Label getMRemitente(){
        return mRemitente;
    }
    
    public Label getMTexto(){
        return mTexto;
    }
}

