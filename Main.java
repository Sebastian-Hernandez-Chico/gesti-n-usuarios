import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestionUsuarios gestion = new GestionUsuarios();

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE GESTIÓN DE USUARIOS =====");

            System.out.println("1. Agregar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Buscar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese correo: ");
                    String correo = scanner.nextLine();

                    Usuario usuario = new Usuario(id, nombre, correo);

                    gestion.agregarUsuario(usuario);

                    break;

                case 2:

                    gestion.mostrarUsuarios();

                    break;

                case 3:

                    System.out.print("Ingrese ID a buscar: ");
                    int idBuscar = scanner.nextInt();

                    gestion.buscarUsuario(idBuscar);

                    break;

                case 4:

                    System.out.print("Ingrese ID a eliminar: ");
                    int idEliminar = scanner.nextInt();

                    gestion.eliminarUsuario(idEliminar);

                    break;

                case 5:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
