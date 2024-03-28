/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_herencia3;

/**
 *
 * @author mauro
 */
public class Tp1_herencia3 {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(16, 03, 2024);
        FechaNacimiento fechaNacimiento = new FechaNacimiento(07, 12, 1999, "Sagitario");

        fecha.mostrarFecha();

        fechaNacimiento.mostrarFecha();
        fechaNacimiento.mostrarFechaNacimiento();
    }
}
