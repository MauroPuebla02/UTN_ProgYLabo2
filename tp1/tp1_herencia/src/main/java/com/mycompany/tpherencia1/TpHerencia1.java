/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpherencia1;

/**
 *
 * @author mauro
 */
public class TpHerencia1 {

    public static void main(String[] args) {
      Automovil automovil = new Automovil("Chevrolet", "Onix", 4);
        Motocicleta moto = new Motocicleta("Honda", "CB500X", 500);

        automovil.arrancar();
        automovil.conducir();
        automovil.detener();

        moto.arrancar();
        moto.acelerar();
        moto.detener();
    }
}
