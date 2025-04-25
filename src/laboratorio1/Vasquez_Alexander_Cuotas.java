/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1;
import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class Vasquez_Alexander_Cuotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Ingrese los datos de la Cuota--");
        System.out.println("\nIngrese el Monto del Prestamo: ");
        double monto = scanner.nextDouble();
        System.out.println("Ingrese el plazo en Meses en que se pagara el Prestamos:");
        double meses = scanner.nextDouble();
        System.out.println("Ingrese el % Interes Mensual que se aplicara: ");
        double interes = scanner.nextDouble();
        System.out.println("Ingrese la Comision por Cuota del prestamo: ");
        double comision = scanner.nextDouble();
        System.out.println("Ingrese el % de Seguro aplicado a la cuota");
        double seguro = scanner.nextDouble();
        double interesTotal= (monto * (interes/100) * meses)/meses;
        double montoMensual= monto/meses;
        montoMensual= montoMensual + interesTotal+comision;
        double seguroMensual = montoMensual*(seguro/100);
        montoMensual= montoMensual + seguroMensual;
        double total= montoMensual * meses;
        
        System.out.println("\n**** CUOTAS MENSUALES ****");
        System.out.printf("Cuota de Pago Mensual: HNL." + String.format("%.2f", montoMensual)+ "\nTotal a Pagar: HNL. " + String.format("%.2f", total));

       

        
      
    }
    
}
