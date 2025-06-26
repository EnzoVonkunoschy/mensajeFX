
package com.example.demo;

import java.util.HashSet;



public class MainController {
    private Usuario usuario;
    private MainView vista;

    public MainController(MainView vista) {
        this.vista   = vista;
        this.usuario = new Usuario("Enzo");

        vista.getLabel().setText("Bienvenido, " + usuario.getNombre());
        
        vista.getButton().setOnAction(e ->{ 

            String desti = vista.getDestinatario().getText(); 
            String remi  = vista.getRemitente().getText();
            String text  = vista.getTexto().getText();

            Mensaje mensaje = new Mensaje(desti, remi, text);
            vista.setMensaje(mensaje);
            Controlador.mostrarXConsola(mensaje);

            /*
            vista.getMDestinatario().setText(vista.getDestinatario().getText());
            vista.getMRemitente().setText(vista.getRemitente().getText());
            vista.getMTexto().setText(vista.getTexto().getText());*/
        });
        
    }
}