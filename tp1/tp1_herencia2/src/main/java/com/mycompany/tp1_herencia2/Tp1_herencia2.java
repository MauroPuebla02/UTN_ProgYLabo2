/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_herencia2;

/**
 *
 * @author mauro
 */
public class Tp1_herencia2 {

    public static void main(String[] args) {
      Libro libro = new Libro("Cien años de soledad", "Novela", 20.0, "Gabriel García Márquez", 352);
        Ropa ropa = new Ropa("Camiseta", "Prenda de vestir", 15.0, "M", "Azul");

        libro.vender();
        libro.leer();

        ropa.vender();
        ropa.usar();
    }
}
