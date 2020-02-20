package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private String nombreArchivo;
    private String separador;
    //separador = "[,:;?!\\.() ]+";   ---> Ejemplo separador


    public ReadFile(String nombreArchivo, String separador){
        this.nombreArchivo = "filesToRead/" + nombreArchivo;
        this.separador = separador;
    }


    public ArrayList<String[]> read() {
        File f = new File(nombreArchivo);
        FileReader fichero = null;
        BufferedReader lectura = null;

        ArrayList<String[]> res = new ArrayList<String[]>();

        // In case the file doesn't exists
        try {
            fichero = new FileReader(nombreArchivo);
            lectura = new BufferedReader(fichero);
        } catch(FileNotFoundException fe) {System.out.println("No se encontró el archivo " + f.getName());System.exit(0);}


        // Reading the file
        try {
            // First line read
            String line = lectura.readLine();
            while(line != null) {
                String[] f_line = line.split(separador);
                res.add(f_line);
                line = lectura.readLine();
            }

        } catch(IOException e){System.err.println(e); System.exit(0);}


        // Close the file
        try {
            if(fichero != null) {
                fichero.close();
                lectura.close();
            }
        } catch(IOException ex){System.out.println(ex);}
   
        return res;
    }

}