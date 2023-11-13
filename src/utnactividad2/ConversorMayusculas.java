
package utnactividad2;

import java.util.ArrayList;
import java.util.List;


public class ConversorMayusculas { //implementa el método de la interface funcional 
   
   public List<String> convertir(List <String> cadenas){
      //variable del tipo de la interface, donde implementamos el método en una exp lambda
      Transformador trans = (f)-> f.toUpperCase();//
      List <String> cadMay = new ArrayList<>();
      String x;
      for(String cadena:cadenas){
          x = trans.convertirA(cadena);
          cadMay.add(x);
      }
      return cadMay;
   }
   
   
   
}                                                                                                                                
