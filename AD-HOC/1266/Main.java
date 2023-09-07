import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, numero, zero, soma, inicio, postes;

        while (sc.hasNext()) {
            n = sc.nextInt();
            if (n >= 5 && n <= 5000) {
                zero = 0;
                soma = 0;
                inicio = 0;
                postes = 0;
                for (int i = 0; i < n; i++) {
                    numero = sc.nextInt();
                    if (numero == 0 && inicio == 0) {
                        zero++;
                        postes++;
                    } else if (numero == 0 && inicio == 1) {
                        postes++;
                    }
                    if (numero == 1) {
                        inicio = 1;
                        soma += postes / 2;
                        postes = 0;
                    }
                }
                if (postes > 0) {
                    soma -= zero / 2;
                    postes += zero;
                    soma += postes / 2;
                }
                System.out.println(soma);
            }
        }
    }

}
