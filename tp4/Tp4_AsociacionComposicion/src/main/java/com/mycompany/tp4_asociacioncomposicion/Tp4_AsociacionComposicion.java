/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp4_asociacioncomposicion;

/**
 *
 * @author mauro
 */
public class Tp4_AsociacionComposicion {

    public static void main(String[] args) {

        Recibo recibo = new Recibo();
        Fecha fecha = new Fecha();
        fecha.setDia(12);
        fecha.setMes(12);
        fecha.setAnio(2024);
        recibo.setFecha(fecha);
        recibo.setTipo('A');
        recibo.setNumero(8765432);
        recibo.setDetalle("Coca Cola");

    }
}
