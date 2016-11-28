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
public class ScooterElectrico extends Scooter {

    public ScooterElectrico(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Caracteristicas Scooter electrico: "+ super.toString());
    }
    
}
