/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_interface_abstractas;

/**
 *
 * @author mauro
 */
public abstract class Animal implements Hablar {

    protected String nombre;
    protected int largo;

    public Animal(String nombre) {
        this.nombre = nombre;

    }

    public abstract void parir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

}
