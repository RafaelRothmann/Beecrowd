import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            long n = sc.nextLong();
            long m = sc.nextLong();

            long soma = n ^ m;

            System.out.println(soma);
            
        }

    }

} 