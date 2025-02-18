/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.producto.Constructor;

import espcoh.ec.edu.producto.Modelo.GertorProducto;
import espcoh.ec.edu.producto.Modelo.Gestor;
import espcoh.ec.edu.producto.Vista.Principal;

public class Constructor {

    private GertorProducto gertorProducto;
    private Principal principal;

    public Constructor() {
    }

    public Constructor(GertorProducto gertorProducto, Principal principal) {
        this.gertorProducto = gertorProducto;
        this.principal = principal;
    }

    public GertorProducto getGertorProducto() {
        return gertorProducto;
    }

    public void setGertorProducto(GertorProducto gertorProducto) {
        this.gertorProducto = gertorProducto;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Constructor(Principal principal, int tamanoVector) {
        this.principal = principal;
        this.gertorProducto = new GertorProducto(tamanoVector);
    }

    public void GestorProducto() {
        if (this.principal != null) {

            Gestor objProducto = new Gestor();
            objProducto.setNombre(principal.getTitulo());
            objProducto.setPrecio(Float.parseFloat(principal.getPrecio()));
            objProducto.setDisponibilidad(principal.getDisponibilidad());
            this.gertorProducto.agregarProducto(objProducto);
        }
    }

}
