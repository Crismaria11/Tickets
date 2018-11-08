package pelis;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListadoPeliculas {
    public static List<String> listadoPeliculas = new ArrayList<String>();
    public ListadoPeliculas() {

    }

    public static List<String> getListadoPeliculas() {
        return listadoPeliculas;
    }

    public static void setListadoPeliculas() {
        listadoPeliculas = listadoPeliculas;
    }

    public static int getrTamanoListado(){
        return listadoPeliculas.size();
    }

    public static List<String> getListadoPeliculasDeCola(int cola) {
        int empezar = cola * 3;
        int terminar = empezar + 3;
        return listadoPeliculas.subList(empezar,terminar);

    }

    public static void cargarArchivoPeliculas(String url) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new BufferedReader(new FileReader(url)));
        try {
            while (inputFile.hasNext()) {
                String nombrePelicula = inputFile.nextLine();
                listadoPeliculas.add(nombrePelicula);
            }
        } finally {
            if (inputFile != null){
                inputFile.close();
            }
            System.out.println("Listado de peliculas: ");
            listadoPeliculas.forEach(pelicula -> System.out.println(pelicula));
            System.out.println("\n");
        }
    }
}
