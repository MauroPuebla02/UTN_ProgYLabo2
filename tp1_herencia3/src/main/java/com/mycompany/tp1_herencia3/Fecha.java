/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_herencia3;

/**
 *
 * @author mauro
 */
public class Fecha {
    protected int dia;
    protected int mes;
    protected int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void mostrarFecha() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
    }
}
