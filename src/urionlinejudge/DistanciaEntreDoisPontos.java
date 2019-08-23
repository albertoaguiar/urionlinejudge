package urionlinejudge;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

/**
 *
 * @author alber
 */
public class DistanciaEntreDoisPontos {
    
    void calcular(){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0000", DecimalFormatSymbols.getInstance(Locale.US));
        
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println( df.format(distancia));
    }
    
}
