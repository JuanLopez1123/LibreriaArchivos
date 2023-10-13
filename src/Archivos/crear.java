package Archivos;

import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class crear {


    void Crear(){
      
        try {
           String directorio = System.getProperty("user.dir");
            String ruta = directorio + "/recursos/txt/creacion.txt";
           Path archivo = Paths.get(ruta);   
           Files.createFile(archivo);
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "El archivo no se creo correctamente");
        }
    }   

}
