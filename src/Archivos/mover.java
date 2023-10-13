
package Archivos;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class mover {
    
    void Mover (String Destino){
        
        try{
        String directorio = System.getProperty("user.dir");
            String ruta = directorio + "/recursos/txt/Mover.txt";
            Path archivo = Paths.get(ruta);
        File Archivo = new File(ruta);
        File destino = new File(Destino);
        Archivo.renameTo(destino);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "El archivo no se Movio correctamente");
        }
    }
    
}
