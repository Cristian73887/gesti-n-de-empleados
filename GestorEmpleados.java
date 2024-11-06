/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class GestorEmpleados {
    private ArrayList<Empleado> listaEmpleados;
    
    public GestorEmpleados(){
        this.listaEmpleados = new ArrayList<>();
    }
    
    public void agragarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
        System.out.println("Empleado Agregado: ");
    }
    
    public void mostrarEmpleados(){
        if(listaEmpleados.isEmpty()){
            System.out.println("No hay empleados en la lista.");
            
        }else{
            for(Empleado empleado : listaEmpleados){
                empleado.imprimirInformacion();
                System.out.println("--------");
            }
        }
    }
}
