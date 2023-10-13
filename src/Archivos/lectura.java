
package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class lectura {
    
    public String leerTxt ()throws Exception{
        String Texto = "";
            
            String directorio = System.getProperty("user.dir");
            String ruta = directorio + "/recursos/txt/lectura.txt";
        try{   
            
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String temp = ""; String Linea;
            
            while ((Linea = br.readLine()) != null){
            System.out.print(Linea+"\n"); temp = Linea + temp;
            }
            br.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se encontro el archivo, por favor verificar la ruta");
        }
        
        return Texto;
    }
    
}
