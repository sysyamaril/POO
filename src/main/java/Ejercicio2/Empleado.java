/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author HP
 */
@Getter
@Setter
public class Empleado extends Persona{
    
    private double sueldo;
    private int Dni;

    public Empleado(double sueldo, int Dni, int codigo, String nombre, int edad) {
        super(codigo, nombre, edad);
        this.sueldo = sueldo;
        this.Dni = Dni;
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println(getNombre()+" come más rápido porque tiene un horario");
    }
    
    public void estudiar(){
    System.out.println("El numero de Dni es: " +Dni);
    }
}
        

