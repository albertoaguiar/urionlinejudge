package urionlinejudge;

import java.util.*;

public class Distancia {
    
    void calcularTempo() {
        
        Scanner entrada = new Scanner(System.in);
        int distancia = entrada.nextInt();
        
        int tempo = 2*distancia;
        
        System.out.println(tempo + " minutos");
        
    }
}
