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

    /*
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


