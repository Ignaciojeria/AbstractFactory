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
public abstract class Automovil {
    
    protected String modelo;
    protected String color;
    protected int potencia;
    protected int espacio;

    public Automovil(String modelo, String color, int potencia, int espacio) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }

    @Override
    public String toString() {
        return "modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", espacio=" + espacio;
    }
    
    public abstract void mostrarCaracteristicas();
    
}
