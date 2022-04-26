import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MainFicheros {
    public static void main(String[] args) throws Exception {
        // File fichero = new File("../../test.txt");
        String fichero = "../../test.txt";
        String fichero2 = "../EscribirFich.txt";
        Scanner sc= new Scanner(System.in);
        int opcion;
        boolean run = true;
        VectorStrings hola = new VectorStrings(fichero);
       do {
        System.out.println("Que quieres hacer?");
        System.out.println("1. Leer fichero");
        System.out.println("2. Escribir fichero");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(hola);
                break;
            case 2:
                hola.EscribirFich(fichero2);
                break;
            case 3:
            Scanner sci= new Scanner(System.in);
            System.out.println("Introduce la frase que quieras meter");
            String frase = sci.nextLine();
            hola.insertar(frase);
                break;
        
            default:
                break;
        }
       } while (run); 
    }
}
