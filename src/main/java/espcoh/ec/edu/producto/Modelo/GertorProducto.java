/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.producto.Modelo;

public class GertorProducto {

    private int tamanoVector;
    private Gestor[] productos;
    private int cont;

    public GertorProducto(int tamanoVector) {
        this.tamanoVector = tamanoVector;
        this.productos = new Gestor[tamanoVector];
        this.cont = 0;
    }

    public void agregarProducto(Gestor gestor) {
        if (cont < productos.length) {
            productos[cont] = gestor;
            cont++;
        } /*else {
            System.out.println("Error: No se puede agregar más productos, el vector está lleno.");
        }*/
    }

    public Gestor[] listarProductos() {
        Gestor[] auxProductos = new Gestor[cont];
        for (int i = 0; i < cont; i++) {
            auxProductos[i] = productos[i];
        }
        return auxProductos;
    }

}
