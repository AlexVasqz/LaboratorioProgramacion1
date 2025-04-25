/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author alexv
 */
import java.util.Scanner;
public class Vasquez_Alexander_Formulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("Formula 1: a/b + c/d");
        System.out.println("Ingrese el valor de el numerador 1'a'");
        double a = scanner.nextInt();
        System.out.println("Ingrese el valor de el denominador 2'b'");
        double b = scanner.nextInt();
        System.out.println("Ingrese el valor de el numerador 2'c'");
        double c = scanner.nextInt();
        System.out.println("Ingrese el valor de denomindar'd'");
        double d = scanner.nextInt();
        double respuesta = (a/b)+ (c/d);
        System.out.println("Respuesta: "+ respuesta);
        //2
      
        System.out.println("Formula 2: (1 / (x - 5)) - (3xy / 4)");
        System.out.println("Ingrese el valor de 'x'");
        double x = scanner.nextDouble();
        System.out.println("Ingrese el valor de 'y'");
        double y = scanner.nextDouble();
        double respuesta1 = (1/(x-5)) -(3*x*y/4);
        System.out.println("Respuesta: " + respuesta1);
        
        //3
       
        System.out.println("Formula 3: c/d + a )");
        System.out.println("Ingrese el valor de el la suma 'a'");
        double a2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de el numerador 'c'");
        double c2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de el denominador 'd'");
        double d2 = scanner.nextDouble();
        double respuesta3 = (c2/d2) + a2 ;
        System.out.println("Respuesta: " + respuesta3);
        
        //4
        System.out.println("Formula 4: a + c/d)");
        System.out.println("Ingrese el valor de la suma'a'");
        double a1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de el numerador'c'");
        double c1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de denominador'd'");
        double d1 = scanner.nextDouble();
        double respuesta2 = a1+(c1/d1);
        System.out.println("Respuesta: " + respuesta2);
        
        //5
        System.out.println("\nFórmula 5: (a² / (b - c)) + ((d - e) / (f - (g * h / j)))");

        System.out.print("Ingrese el valor de el numerador 1 'a': ");
        double a3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de el denominador 1'b': ");
        double b3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la resta del nominador 1 'c': ");
        double c3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de el nominador 2 'd': ");
        double d3 = scanner.nextDouble(); 
        System.out.print("Ingrese el valor de la resta del numerador 2 'e': ");
        double e3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de el denominador 2 'f': ");
        double f3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la multiplicacion del denominador 2 'g': ");
        double g3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la multiplicador del denominador 2'h': ");
        double h3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la division del numerador 2 'j': ");
        double j3 = scanner.nextDouble();     
        double respuesta5a= (a3*a3) / (b3 - c3);
        double respuesta5b= (d3 - e3) / ((g3 * h3 / j3) - f3);
        double respuesta5= respuesta5a+respuesta5b;
        System.out.println("respuesta: "+respuesta5);
        
        //6
        System.out.println("Formula 6: m/n + p ");
        System.out.println("Ingrese el valor de el numerador 'm'");
        double m4 = scanner.nextDouble();
        System.out.println("Ingrese el valor de el denominador 'n'");
        double n4 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la suma 'p'");
        double p4 = scanner.nextDouble();
        double respuesta6 = (m4/n4) + p4 ;
        System.out.println("Respuesta: " + respuesta6);
        
        //7
        System.out.println("Formula 7: m + n/d-q");
        System.out.println("Ingrese el valor dl la suma 'm'");
        double m5 = scanner.nextDouble();
        System.out.println("Ingrese el valor de el numerador 'c'");
        double n5 = scanner.nextDouble();
        System.out.println("Ingrese el valor de el nominador 'd'");
        double d5 = scanner.nextDouble();
        System.out.println("Ingrese el valor de denomiandor 'q'");
        double q5 = scanner.nextDouble();
        double respuesta7 = m5+(n5/(d5-q5));
        System.out.println("Respuesta: " + respuesta2);
        
        //8
        System.out.println("Formula 8: a^2/b^2 + c^2/d^2");
        System.out.println("Ingrese el valor de 'a'");
        double a6 = scanner.nextDouble();
        System.out.println("Ingrese el valor de 'b'");
        double b6 = scanner.nextDouble();
        System.out.println("Ingrese el valor de 'c'");
        double c6 = scanner.nextDouble();
        System.out.println("Ingrese el valor de 'd'");
        double d6 = scanner.nextDouble();
        double respuesta8 = a6+b6+c6+d6;
        System.out.println("Respuesta: " + respuesta2);
        
        
 
        
    }
}
