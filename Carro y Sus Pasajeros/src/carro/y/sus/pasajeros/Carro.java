/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro.y.sus.pasajeros;



/**
 *
 * @author Estudiante
 */
public class Carro {
    
    private Persona Passanger;
    private Persona Other_Passanger;
    private Persona Drivers;

    public Persona getPassanger() {
        return Passanger;
    }

    public Persona getOther_Passanger() {
        return Other_Passanger;
    }

    public Persona getDrivers() {
        return Drivers;
    }

    public void setPassanger(Persona Passanger) {
        this.Passanger = Passanger;
    }

    public void setOther_Passanger(Persona Other_Passanger) {
        this.Other_Passanger = Other_Passanger;
    }

    public void setDrivers(Persona Drivers) {
        this.Drivers = Drivers;
    }
    
    String[] getpassangers(){
        String[] Names = new String[3];
        Names[0] = this.Passanger.getName();
        Names[1] = this.Other_Passanger.getName();
        return Names;
    }
    //void Print_Passanger(){
    //System.out.println("El primer pasagero es "+this.Passanger.getName()+" "+this.Passanger.getLast_Name());
    //}
}
