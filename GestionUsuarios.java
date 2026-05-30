import java.util.ArrayList;

public class GestionUsuarios {

    private ArrayList<Usuario> usuarios;

    public GestionUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado correctamente.");
    }

    public void mostrarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        System.out.println("\nLISTA DE USUARIOS:");

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void buscarUsuario(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                System.out.println("Usuario encontrado:");
                System.out.println(usuario);
                return;
            }
        }

        System.out.println("Usuario no encontrado.");
    }

    public void eliminarUsuario(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                System.out.println("Usuario eliminado.");
                return;
            }
        }

        System.out.println("Usuario no encontrado.");
    }
}
