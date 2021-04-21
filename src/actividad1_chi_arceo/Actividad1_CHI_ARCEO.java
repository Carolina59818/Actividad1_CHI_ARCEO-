
package actividad1_chi_arceo;

import java.util.Scanner;

/**
 *
 * @author caroc
 */
public class Actividad1_CHI_ARCEO {

    public static void main(String[] args) {
  //Escriba un programa que con base al año actual Y lea un año cualquiera 
  //y que escriba cuántos años han pasado desde ese año o cuántos años faltan para llegar a ese año
        int año_actual = 2021;
        int año_cualquiera;
        int años;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un año");
        año_cualquiera = entrada.nextInt();
        
        if (año_actual > año_cualquiera){
            años = (año_actual - año_cualquiera);
            System.out.println("Los años que han pasado son: " + años);
        } else if (año_cualquiera > año_actual) {
            años = (año_cualquiera - año_actual);
            System.out.println("Los años faltan son: " + años);
       
            
             }
    }     
}
