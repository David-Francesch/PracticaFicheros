import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainFicheros {
    public static void main(String[] args) throws Exception {
        File fichero = new File("../../test.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader bfr = new BufferedReader(fr);
    }

}
