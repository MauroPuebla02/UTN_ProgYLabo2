/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp2_interface_abstractas;

/**
 *
 * @author mauro
 */
public class Tp2_Interface_Abstractas {

    public static void main(String[] args) {
        Humano hum = new Humano("Nicolas");
        Perro per = new Perro("Tommy");

        per.setRaza("Ovejero Aleman");
        hum.Hablar();
        hum.Correr();
        per.Hablar();
        per.Hablar();
    }
}
