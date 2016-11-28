/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import FabricaAbstracta.FabricaVehiculo;
import FabricaAbstracta.Automovil;
import FabricaAbstracta.Scooter;
import FabricaAbstracta.FabricaVehiculoElectricidad;
import FabricaAbstracta.FabricaVehiculoGasolina;
import java.util.Scanner;
/**
 *
 * @author Sir Ignacio
 */
public class Catalogo {
 
    public static void main(String[] args) {
        
        
        int opcion;
        
        Scanner preparaEntrada= new Scanner(System.in);
        
       System.out.println("Ingresa una opción numerica");
       
        System.out.println("Opcion 1: Catalogo automoviles électricos ");
        System.out.println("Opcion 2: Catalogo automoviles a gasolina ");
       
        opcion= preparaEntrada.nextInt();
        FabricaVehiculo fabrica;
        Automovil auto;
        Scooter scot;
        
        switch (opcion) {
            case 1:
                fabrica= new FabricaVehiculoElectricidad();
                auto= fabrica.creaAutomovil("zuzuki", "rojo", 0, 0);
                scot= fabrica.creaScooter("nerf", "verde", 1, 2);
                auto.mostrarCaracteristicas();
                scot.mostrarCaracteristicas();
                break;
            case 2:
                fabrica= new FabricaVehiculoGasolina();
                auto= fabrica.creaAutomovil("power", "negro", 100, 2);
                scot= fabrica.creaScooter("bull", "amarillo", 983, 800);
                auto.mostrarCaracteristicas();
                scot.mostrarCaracteristicas();
                break;
            default:
                System.out.println("Lo sentimos, esa opción no está disponible");
                break;
        }

 
    }
    
}
