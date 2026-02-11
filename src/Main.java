import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese su email: ");
        String email = sc.nextLine();

        System.out.print("Ingrese su número de teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = sc.nextLine();

        System.out.println(" --RESUMEN DE DATOS-- ");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);

        sc.close();

    }

}
