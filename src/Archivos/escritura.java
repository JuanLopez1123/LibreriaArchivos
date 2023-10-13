package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class escritura {
   
    void escribirTxt (String txt) throws Exception{
        
        
        String directorio = System.getProperty("user.dir");
            String ruta = directorio + "/recursos/txt/escritura.txt";
    try{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));    
        writer.write(txt);
        writer.flush();
    
        writer.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No se encontro el archivo, por favor verificar la ruta");
        }      
    
    }
    
}
