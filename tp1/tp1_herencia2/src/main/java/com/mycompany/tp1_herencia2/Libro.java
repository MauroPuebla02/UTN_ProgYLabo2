/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_herencia2;

/**
 *
 * @author mauro
 */
public class Libro extends Producto{
    private String autor;
    private int numPaginas;

    public Libro(String nombre, String descripcion, double precio, String autor, int numPaginas) {
        super(nombre, descripcion, precio);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void leer() {
        System.out.println("El libro se está leyendo...");
    }
}
