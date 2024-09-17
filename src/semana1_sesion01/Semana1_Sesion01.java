
package semana1_sesion01;
import java.util.Scanner;
public class Semana1_Sesion01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los datos
        System.out.print("Ingresa el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        
        System.out.print("Ingresa el producto: ");
        String producto = sc.nextLine();
        
        System.out.print("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        
        System.out.print("Ingresa la cantidad: ");
        int cantidad = sc.nextInt();
        
        // Calcular el subtotal
        double subtotal = precio * cantidad;
        
        // Calcular el IGV (18% del subtotal)
        double IGV = subtotal * 0.18;
        
        // Calcular el total a pagar (subtotal + IGV)
        double totalPagar = subtotal + IGV;
        
        // Mostrar los resultados
        System.out.println("\n--- Factura ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + IGV);
        System.out.println("Total a Pagar: " + totalPagar);
        
        // Cerrar el scanner
        sc.close();
    }

}
