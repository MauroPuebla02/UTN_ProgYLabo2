/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp2_interface2;

/**
 *
 * @author mauro
 */
public class Tp2_Interface2 {

    public static void main(String[] args) {
        Auto tutu = new Auto("Ford");
        Lavarropas lava = new Lavarropas("Dreams", "f42", "12521413i");

        tutu.setCantRuedas(4);
        tutu.setColor("Rojo");
        lava.arrancar();
        tutu.arrancar();
        lava.frenar();
        tutu.frenar();
    }
}
