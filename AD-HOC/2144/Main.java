import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bracoDir = 1, bracoEsq = 1, numeroRepeticoes = 1;
        float w1 = 45, w2 = 45, sum = 0, wMedia = 0;
        int total = 0;

        do {

            bracoEsq = sc.nextInt();
            bracoDir = sc.nextInt();
            numeroRepeticoes = sc.nextInt();

            if (bracoEsq == 0 && bracoDir == 0 && numeroRepeticoes == 0) {
                break;
            }

            w1 = (bracoDir * (1 + ((numeroRepeticoes) / 30.0F)));

            w2 = (bracoEsq * (1 + ((numeroRepeticoes) / 30.0F)));

            wMedia = (w1 + w2) / 2.0F;
            sum += wMedia;
            total++;

            if (wMedia >= 1 && wMedia < 13) {
                System.out.println("Nao vai da nao");
            } else if (wMedia >= 13 && wMedia < 14) {
                System.out.println("E 13");
            } else if (wMedia >= 14 && wMedia < 40) {
                System.out.println("Bora, hora do show! BIIR!");
            } else if (wMedia >= 40 && wMedia <= 60) {
                System.out.println("Ta saindo da jaula o monstro!");
            } else if (wMedia > 60) {
                System.out.println("AQUI E BODYBUILDER!!");
            }

        } while (bracoDir >= 1 && bracoEsq >= 1 && numeroRepeticoes >= 1);

        if (sum / total > 40) {
            System.out.println();
            System.out.println("Aqui nois constroi fibra rapaz! Nao e agua com musculo!");
        }

    }
}
