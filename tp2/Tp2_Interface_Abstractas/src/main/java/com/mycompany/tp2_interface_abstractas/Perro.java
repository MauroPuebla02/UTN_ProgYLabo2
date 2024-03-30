/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_interface_abstractas;

/**
 *
 * @author mauro
 */
public class Perro extends Animal {

    private String raza;

    public Perro(String nombre) {
        super(nombre);

    }

    @Override
    public void parir() {
        System.out.println("Soy un perro pariendo");
    }

    @Override
    public void Hablar() {
        System.out.println("Guau Guau");
    }

    @Override
    public void Correr() {
        System.out.println("Perro corriendo a 40 km/hs");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
