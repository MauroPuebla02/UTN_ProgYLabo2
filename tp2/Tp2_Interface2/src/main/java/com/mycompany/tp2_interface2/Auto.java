/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_interface2;

/**
 *
 * @author mauro
 */
public class Auto extends Vehiculo {

    private String color;
    private int nroChasis;

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Auto arrancando....");
    }

    @Override
    public void frenar() {
        System.out.println("Auto frenando....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(int nroChasis) {
        this.nroChasis = nroChasis;
    }

}
