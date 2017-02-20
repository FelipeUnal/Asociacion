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
public class Persona {
    private String Name;
    private String Last_Name;

    public Persona(String Name, String Last_Name) {
        this.Name = Name;
        this.Last_Name = Last_Name;
    }

    public String getName() {
        return Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }
    
    
    
}
