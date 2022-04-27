import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MainFicheros {
    public static void main(String[] args) throws Exception {
        // File fichero = new File("../../test.txt");
        // String fichero = "../../test.txt";
        String fichero = "C:/Users/Alumno/Desktop/David_Francesch/Programacion/javaFicheros/test.txt";
        String fichero2 = "C:/Users/Alumno/Desktop/David_Francesch/Programacion/javaFicheros/COSAS/EscribirFich.txt";
        Scanner sc= new Scanner(System.in);
        int opcion;
        boolean run = true;
        VectorStrings hola = new VectorStrings(fichero);
        
       do {
        System.out.println("Que quieres hacer?");
        System.out.println("1. Leer vector");
        System.out.println("2. Escribir fichero");
        System.out.println("3. Insertar en fichero");
        System.out.println("4. lee");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
            // hola = new VectorStrings(fichero);
                System.out.println(hola);
                break;
            case 2:
            // hola = new VectorStrings(fichero);
                hola.EscribirFich(fichero2);
                break;
            case 3:
            // hola = new VectorStrings(fichero);
                Scanner sci= new Scanner(System.in);
                System.out.println("Introduce la frase que quieras meter");
                String frase = sci.nextLine();
                hola.insertar(frase);
                break;
            case 4:    
                LeerFich(fichero);
                LeerFich(fichero2);
                break;
            default:
            System.out.println("Selecciona una opcion correcta");
                break;
        }
       } while (run); 
    }

    public static void LeerFich(String fich) {
        try {
            String frase;
            FileReader r = new FileReader(fich);
            BufferedReader br = new BufferedReader(r);
             while ((frase = br.readLine())!=null) {
                 System.out.println(frase);
             }
             br.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
