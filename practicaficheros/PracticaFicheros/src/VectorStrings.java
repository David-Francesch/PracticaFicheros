import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class VectorStrings extends Vector{
    
    

    public VectorStrings(){
    }

    public VectorStrings(String fich){
        try {
            FileReader fr = new FileReader(fich);
            BufferedReader bfr = new BufferedReader(fr);
            String tope;
            while ((tope = bfr.readLine()) != null) {
                this.addElement(tope);
            }
            bfr.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    
    public void EscribirFich(String fich) {
        try {
            FileWriter w = new FileWriter(fich);
            BufferedWriter wr = new BufferedWriter(w);
            for (int i = 0; i < elementData.length; i++) {
                String linea = (String) this.elementData[i];
                if (linea != null) {
                    wr.write(linea);
                    wr.newLine();
                }
            }
            wr.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void insertar(String fich) {
        try {
            for (int i = 0; i < elementData.length; i++) {
                if (fich.compareTo((String)elementAt(i)) < 0) {
                    this.add(i, fich);
                    break;
                    // insertElementAt(fich, i);
                }else{
                    this.add(i+1, fich);
                    break;
                }
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        // public void LeerFich(String fich) {
        //     try {
        //         String frase;
        //         FileReader r = new FileReader(fich);
        //         BufferedReader br = new BufferedReader(r);
        //         //  while ((frase = br.readLine())!=null) {
        //         //      System.out.println(frase);
        //         //  }
        //         for (int i = 0; i < this.elementData.length; i++) {
        //             frase = this.
        //         }
        //          br.close();
        //     } catch (Exception e) {
        //         //TODO: handle exception
        //     }
        // }
    }
}
