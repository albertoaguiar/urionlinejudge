package urionlinejudge;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class GastoCombustivel {
    
    void calcularGasto() {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.000", DecimalFormatSymbols.getInstance(Locale.US));
        
        int tempoViagem = entrada.nextInt();
        int velocidade = entrada.nextInt();
        
        double distancia = velocidade*tempoViagem;
        double litros = distancia/12;
        
        System.out.println(df.format(litros));
    }
    
}
