import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            if (n >= 2 && n <= Math.pow(10, 4)) {
                int NumeroMaximo = 61;
                int[] direito = new int[NumeroMaximo];
                int[] esquerdo = new int[NumeroMaximo];
                int paresBota = 0;
    
                for (int i = 0; i < n; i++) {
                    int numCaldo = sc.nextInt();
    
                    char pe = sc.next().charAt(0);
    
                    if (pe == 'D') {
                        direito[numCaldo]++;
                        if (esquerdo[numCaldo] > 0) {
                            esquerdo[numCaldo]--;
                            direito[numCaldo]--;
                            paresBota++;
                        }
                    } else {
                        esquerdo[numCaldo]++;
                        if (direito[numCaldo] > 0) {
                            direito[numCaldo]--;
                            esquerdo[numCaldo]--;
                            paresBota++;
                        }
                    }
    
                }
                System.out.println(paresBota);
            }
        }
    }
}