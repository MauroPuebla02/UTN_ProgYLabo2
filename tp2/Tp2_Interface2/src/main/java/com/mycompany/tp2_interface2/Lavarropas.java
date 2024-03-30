/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_interface2;

/**
 *
 * @author mauro
 */
public class Lavarropas extends Electrodomestico {

    private String fabricante;

    public Lavarropas(String fabricante, String marca, String modelo) {
        super(marca, modelo);
        this.fabricante = fabricante;
    }

    @Override
    public void arrancar() {
        System.out.println("Lavarropas arrancando....");
    }

    @Override
    public void frenar() {
        System.out.println("Lavarropas frenando...");
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
