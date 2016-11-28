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
public class AutoDeGasolina extends Automovil {

    public AutoDeGasolina(String modelo, String color, int potencia, int espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Caracteristicas auto a gasolina "+super.toString());
    }
    
}
