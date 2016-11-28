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
public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, int espacio) {
      return new AutoElectrico(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia, int espacio) {
         return new ScooterElectrico(modelo, color, potencia);
    }
    
}
