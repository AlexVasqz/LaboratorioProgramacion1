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

public class CostoPromedioClicks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio1 = 0.30;
        double precio2 = 0.25;
        double precio3 = 0.80;
        System.out.print("\nCuantos paquetes de 60 clics a $0.30 quiere?: ");
        int paquetes1 = scanner.nextInt();
        int clicks1 = paquetes1 * 60;
        System.out.print("\nCuantos paquetes de 100 clics a $0.25 quiere?: ");
        int paquetes2 = scanner.nextInt();
        int clicks2 = paquetes2 * 100;
        System.out.print("\nCuantos paquetes de 20 clics a $0.80 quiere?: ");
        int paquetes3 = scanner.nextInt();
        int clicks3 = paquetes3 * 20; 
        double total = (clicks1 * precio1) + (clicks2 * precio2) + (clicks3 * precio3);
        int totalClicks = clicks1 + clicks2 + clicks3;
        double costoPromedio = totalClicks == 0 ? 0 : total / totalClicks;
        double isv = total * 0.16;
        double totalConISV = total + isv;
      
        System.out.println("\n**** RESULTADO ****");
        System.out.println("Cantidad total de clics: " + totalClicks + "\nCosto Promedio por Click: $" + String.format("%.2f", costoPromedio) +  "\nTotal a Pagar (con ISV): $" + String.format("%.2f", totalConISV));

      
    }
}

        
      
 