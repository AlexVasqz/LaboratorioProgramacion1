/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio1;

/**
 *
 * @author alexv
 */
import java.util.Scanner;
public class Vasquez_Alexander_planillaDelEmpleado{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre del empleado: ");
        String nombre = scanner.next();
        System.out.println("\nIngrese la cantidad de horas trabajadas en el mes: ");
        double horas = scanner.nextDouble();
        System.out.println("\nIngrese el precio por hora:");
        double tarifa = scanner.nextDouble();
        
        double salarioSemanal = (tarifa*horas)/4;
        
        System.out.println("----Bolre del Empleado----");
        System.out.println("\nNombre del Empleado: "+ nombre + "\nHora de Trabajo Mensual: "+ horas+ "\nTarifa por hora: Lps."+tarifa+"\nSalario del Empleado semanal: Lps."+ salarioSemanal);
        scanner.close();
        
     
    }
    
    
    
    
    
}

/*Planilla de Empleado: se requiere un algoritmo para elaborar
una parte de la planilla de un empleado. Para ello se dispone d
e sus horas laboradas en el mes, así como la tarifa por hora, al
conocer estas informaciones de horas y el precio por hora, son a
signadas por el usuario, para lograr obtener el salario del empleado semanal.
Los valores deben ser ingresados desde el teclado, asi como horas trabajadas,
tarifa por hora y el nombre completo del empleado(usar next( ), en donde, debe aceptar espacios en blanco) . 
----- Boleta del Empleado -------
Nombre del Empleado: " "
Hora de Trabajo Mensual: ##
Tarifa por Hora : Lps. ##.##
Salario del Empleado Semanal: Lps. ##.##
