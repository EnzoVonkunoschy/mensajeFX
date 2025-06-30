package com.example.mensajefx;

public class Controlador {
    public static void mostrarXConsola(Mensaje mensaje) {
        System.out.println("--- MENSAJE EN CONSOLA ---");
        System.out.println("Destinatario: " + mensaje.destinatario);
        System.out.println("Remitente:    " + mensaje.remitente);
        System.out.println("Texto:        " + mensaje.texto);
        System.out.println("--------------------------");
    }
}
