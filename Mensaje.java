/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo1;

/**
 *
 * @author OFICINA19
 */
public class Mensaje {
    String destinatario;
    String remitente;
    String texto;
    
    public Mensaje(String des, String rem, String tex){
        this.destinatario = des;
        this.remitente = rem;
        this.texto = tex;
    }
    
    public String toString(){
        return this.destinatario+"  "+this.remitente+"  "+this.texto;
    }
    
}
