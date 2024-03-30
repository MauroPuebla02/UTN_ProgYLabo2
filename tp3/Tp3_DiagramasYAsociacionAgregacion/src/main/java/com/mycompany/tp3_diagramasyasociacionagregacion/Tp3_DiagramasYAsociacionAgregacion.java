/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp3_diagramasyasociacionagregacion;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Tp3_DiagramasYAsociacionAgregacion {
    
    public static void main(String[] args) {
        
        Factura fac1 = new Factura();
        Fecha fecha1 = new Fecha();
        fecha1.setDia(30);
        fecha1.setMes(03);
        fecha1.setAnio(2024);
        fac1.setFecha(fecha1);
        fac1.setTipo('B');
        fac1.setNumero(2627389);
        Cliente cliente = new Cliente();
        cliente.setCodigo(234567);
        cliente.setRazonSocial("La Morenita");
        while (true) {            
            Producto produ = new Producto();
            produ.setCodigo(4432);
            produ.setDescripcion("Desodorante");
            produ.setPrecio(2000);
            fac1.getmProducto().add(produ);
            System.out.println("Para dejar de agregar producto ingrese N de lo contrario cualquier tecla");
            String desicion = new Scanner(System.in).nextLine();
            if ("N".equalsIgnoreCase(desicion)) {
                break;
            }
            
        }
        
    }
}
