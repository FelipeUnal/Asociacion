/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro.y.sus.pasajeros;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class CarroYSusPasajeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        System.out.println("Nombre del conductor");
        String NombreConductor = teclado.next();
        
        System.out.println("Apellido del conductor");
        String ApellidoConductor = teclado.next();
        
        System.out.println("Nombre del pasajero :");
        String NombrePasajero1 = teclado.next();
        
        System.out.println("Apellido del pasajero ");
        String ApellidoPasajero1 = teclado.next();
        
        System.out.println("Nombre del pasajero");
        String NombrePasajero2 = teclado.next();
        
        System.out.println("Apellido del pasajero");
        String ApellidoPasajero2 = teclado.next();
        
        Persona Conductor = new Persona(NombreConductor, ApellidoConductor);
        Persona Pasajero1 = new Persona(NombrePasajero1, ApellidoPasajero1);
        Persona Pasajero2 = new Persona(NombrePasajero2, ApellidoPasajero2);
        
        Carro Car =  new Carro();
        Car.setDrivers(Conductor);
        Car.setPassanger(Pasajero1);
        Car.setOther_Passanger(Pasajero2);
        
    }
    
}