/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import helpers.Empleado;
import helpers.GestorEmpleados;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
      Scanner sc = new Scanner (System.in);
      boolean salir = false;
      
     
      while (!salir){
          System.out.println("1. Agregar empleado");
          System.out.println("2. Mostrar empleados");
          System.out.println("3. Salir");
          System.out.println("Seleccione una opsion:");
          int opcion = sc.nextInt();
          sc.nextLine();
          
          switch (opcion){
              case 1:
                  System.out.println("Ingrese el nombre del empleado: ");
                  String nombre = sc.nextLine();
                  
                  System.out.println("Ingrese la edad del empleado: ");
                  int edad = sc.nextInt();
                  
                  System.out.println("Ingrese el salario del empleado: ");
                  double salario = sc.nextDouble();
                  
                  Empleado empleado = new Empleado(nombre, edad, salario);
                  gestor.agragarEmpleado(empleado);
                  break;
                  
              case 2:
                  gestor.mostrarEmpleados();
                  break;
                  
              case 3:
                  salir = true;
                  System.out.print("Saliendo....");
                  break;
                  
              default:
                  System.out.println("Opsion no valida... Intente de nuevo");
                  break;
          }
      }
      sc.close();
    }
    
}
