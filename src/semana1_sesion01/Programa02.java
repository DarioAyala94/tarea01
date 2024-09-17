
package semana1_sesion01;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Arreglo para almacenar los sueldos de los empleados
        double[] sueldos = new double[5];
        double totalSueldos = 0;

        // Ingresar los sueldos de los 5 empleados
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingresa el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = sc.nextDouble();
            totalSueldos += sueldos[i]; // Sumar al total
        }
        
        // Calcular el sueldo promedio
        double promedioSueldos = totalSueldos / sueldos.length;
        
        // Mostrar el total de sueldos y el sueldo promedio
        System.out.println("\nTotal de sueldos: " + totalSueldos);
        System.out.println("Sueldo promedio: " + promedioSueldos);
        
        // Cerrar el scanner
        sc.close();
    }
}
