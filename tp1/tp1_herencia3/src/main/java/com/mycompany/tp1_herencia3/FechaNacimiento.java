/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_herencia3;

/**
 *
 * @author mauro
 */
public class FechaNacimiento extends Fecha{
        private String signoZodiacal;

    public FechaNacimiento(int dia, int mes, int año, String signoZodiacal) {
        super(dia, mes, año);
        this.signoZodiacal = signoZodiacal;
    }

    public String getSignoZodiacal() {
        return signoZodiacal;
    }

    public void mostrarFechaNacimiento() {
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + año + " (" + signoZodiacal + ")");
    }
}
