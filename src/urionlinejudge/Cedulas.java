package urionlinejudge;

import java.util.*;


public class Cedulas {
    
    void calcularCedulas() {
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        
        //cédulas 100, 50, 20, 10, 5, 2 e 1
        int N = valor;
        int n100 = N/100;
        N %= 100;
        
        int n50 = N/50;
        N %= 50;
        
        int n20 = N/20;
        N %= 20;
        
        int n10 = N/10;
        N %= 10;
        
        int n5 = N/5;
        N %= 5;
        
        int n2 = N/2;
        N %= 2;
        
        int n1 = N/1;
        N %= 1;
        
        
        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
    
}
