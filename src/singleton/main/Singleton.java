
package singleton.main;
import singleton.CalculadoraIMC;
import java.util.Scanner;
public class Singleton {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       CalculadoraIMC calc=CalculadoraIMC.getInstancia();
       
       System.out.print("Ingrese su peso en kg:");
       Double peso=sc.nextDouble();
       System.out.print("Ingrese su altura en metros:");
       double altura=sc.nextDouble();
       
       double imc=calc.CalcularIMC(peso, altura);
       String clasificacion=calc.ClasificarIMC(imc);
       
       System.out.printf("Su IMC es: %.2f (%s)%n", imc, clasificacion);
       
       CalculadoraIMC otraReferencia= CalculadoraIMC.getInstancia();
       System.out.println("Ambas referencias son el mismo objeto?" + (calc==otraReferencia));
    }
    
}
