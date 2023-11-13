package utnactividad2;

import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class UTNActividad2 {

    public static void main(String[] args) {        

        ConversorMayusculas conv = new ConversorMayusculas();
        List<String> cadena1 = new ArrayList<>();
        cadena1.add("hOla");
        cadena1.add("cOmO");
        cadena1.add("Estan");             
        List<String> cadenaMayusc = conv.convertir(cadena1);        
        
         for (String cadMay: cadenaMayusc) {
            System.out.print(cadMay + " ");             
        }
         System.out.println("");
    }

}
