/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_diagramasyasociacionagregacion;

import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class Factura extends Comprobante {

    private float total;
    private ArrayList<Producto> mProducto = new ArrayList();
    private Cliente mCliente;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Producto> getmProducto() {
        return mProducto;
    }

    public void setmProducto(ArrayList<Producto> mProducto) {
        this.mProducto = mProducto;
    }

    public Cliente getmCliente() {
        return mCliente;
    }

    public void setmCliente(Cliente mCliente) {
        this.mCliente = mCliente;
    }

}
