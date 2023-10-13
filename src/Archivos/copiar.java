
package Archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class copiar {
    
    void Copiar (String destino){
        
           try{
               String directorio = System.getProperty("user.dir");
            String ruta = directorio + "/recursos/txt/copiar.txt";
           Path archivoOrigen = Paths.get(ruta);
           Path archivoDestino = Paths.get(destino+"/copiar.txt");
           Files.copy(archivoOrigen, archivoDestino);
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "El archivo no se copio correctamente debido a que ya existe");
       }
    }
    
}
