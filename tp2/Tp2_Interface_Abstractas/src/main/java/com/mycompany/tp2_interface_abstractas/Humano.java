/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_interface_abstractas;

/**
 *
 * @author mauro
 */
public class Humano implements Hablar {

    private String nombre;
    private int edad;

    public Humano(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void Hablar() {
        System.out.println("Hola soy un Humano");
    }

    @Override
    public void Correr() {
        System.out.println("Humano corriendo a 15 km/hs");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
