
package Archivos;

import java.io.File;

public class eliminar {
    
    void Eliminar (String Archivo){
         try{
            
            File archivo = new File(Archivo);
            if(archivo.delete()){
                System.out.println("Borrado");
            }else{
                System.out.println("no borrado");
            }
           }catch(Exception e){}
    }
    
}
