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
public class AutoElectrico extends Automovil {

    public AutoElectrico(String modelo, String color, int potencia, int espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Caracteristicas de auto Electrico: " + super.toString()); 
    }
    
}
