
package semana1_sesion01;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los datos del empleado
        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa el cargo del empleado: ");
        String cargo = sc.nextLine();
        
        System.out.print("Ingresa los ingresos mensuales del empleado: ");
        double ingresos = sc.nextDouble();
        
        System.out.print("Ingresa los gastos mensuales del empleado: ");
        double gastos = sc.nextDouble();
        
        // Calcular el ahorro mensual
        double ahorroMensual = ingresos - gastos;
        
        // Calcular el ahorro bimestral, semestral y anual
        double ahorroBimestral = ahorroMensual * 2;
        double ahorroSemestral = ahorroMensual * 6;
        double ahorroAnual = ahorroMensual * 12;
        
        // Mostrar los resultados
        System.out.println("\n--- Información del Empleado ---");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Cargo del empleado: " + cargo);
        System.out.println("Ingresos mensuales: " + ingresos);
        System.out.println("Gastos mensuales: " + gastos);
        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro bimestral: " + ahorroBimestral);
        System.out.println("Ahorro semestral: " + ahorroSemestral);
        System.out.println("Ahorro anual: " + ahorroAnual);
        
        // Cerrar el scanner
        sc.close();
    }
}
