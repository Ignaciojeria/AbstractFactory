/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstracta;

/**
 *
 * @author Sir Ignacio
 */
public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;

    public Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "modelo=" + modelo + ", color=" + color + ", potencia=" + potencia;
    }
    
    public abstract void mostrarCaracteristicas();
    

}
