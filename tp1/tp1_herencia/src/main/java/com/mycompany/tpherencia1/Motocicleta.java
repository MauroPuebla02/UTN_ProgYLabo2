/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpherencia1;

/**
 *
 * @author mauro
 */
public class Motocicleta extends Vehiculo{
        private int cilindrada;

    public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void acelerar() {
        System.out.println("Acelerando motocicleta...");
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
