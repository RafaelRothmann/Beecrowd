import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        


        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] jogo = new int[n];
    
            int joao = 0;
            int maria = 0;
    
            for (int i = 0; i < jogo.length; i++) {
                jogo[i] = sc.nextInt();
                if(jogo[i] == 0){
                    maria++;
                } else if (jogo[i] == 1){
                    joao++;
                }
            }
            if(n > 0){
                System.out.println("Mary won " + maria + " times and John won "+ joao +" times");
            }
        }
    }
}