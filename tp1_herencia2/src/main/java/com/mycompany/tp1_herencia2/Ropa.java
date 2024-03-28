/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_herencia2;

/**
 *
 * @author mauro
 */
public class Ropa extends Producto {
    private String talla;
    private String color;

    public Ropa(String nombre, String descripcion, double precio, String talla, String color) {
        super(nombre, descripcion, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public void usar() {
        System.out.println("La ropa se está usando...");
    }
}
