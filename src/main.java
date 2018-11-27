import cine.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public User login(String username, String password, ArrayList<User> Usuarios) {
        for (int username12 = 0; username12 < Usuarios.size(); ++username12) {
            User UserAdmin = Usuarios.get(username12);

            if (UserAdmin.getUsername().equals(username12)) {
                if (UserAdmin.getPassword().equals(password)) {
                    return UserAdmin;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayList<User> User = new ArrayList<cine.User>();

        Scanner Read = new Scanner(System.in);
        Scanner Read1 = new Scanner(System.in);
        //TheaterRoom uno = new

        System.out.println("Bienvenido al cine");
        int menuSelection = 0;
        boolean out = false;
        while (!out) {
            System.out.println("Menu: ");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");

            try {
                System.out.println("Escribe una opcion");
                menuSelection = Read.nextInt();

                switch (menuSelection) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1, agregar nuevo usuario:");
                        Scanner newish = new Scanner(System.in);
                        System.out.println("Es Administrador?");
                        Boolean admin1 = true;
                        String admin = newish.nextLine();
                        if (admin.equals("si")) {
                            admin1 = true;
                        } else admin1 = false;
                        System.out.println("Escriba un nombre de usuario");
                        String username = newish.nextLine();
                        System.out.println("Escribe tu contrasena");
                        String password = newish.nextLine();
                        System.out.println("Escribe un correo");
                        String email = newish.nextLine();

                        User.add(new User(username, password, email, admin1));
                        System.out.println(User);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2, iniciar sesion");
                        Scanner newsisher = new Scanner(System.in);
                        System.out.println("Ingrese nombre de usuario");
                        String username1 = newsisher.nextLine();
                        System.out.println("Ingrese contrasena");
                        String password1 = newsisher.nextLine();
                        login();

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                Read.next();
            }
        }
        //menu, responda a las preguntas, construyendo un user, respuestas crea un usernane, se agrega a la lista de
        //usernames
        //iniciar sesion comparar el login en la lista
        /*Movie TinkerBell = new Movie("Tinker Bell", 10);
        TheaterRoom uno = new TheaterRoom(1, TinkerBell);
        System.out.println(uno);
          */

    }

    private static void login() {
    }
}
