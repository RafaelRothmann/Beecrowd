import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int numant = 1 , numero = 0;
        boolean falha = false;
        
        while(sc.hasNext()){
            numero = sc.nextInt();
            
            if(numero < numant){  
                falha = true;
                break;
            }
            
            numant = numero;
        }

        if(falha){
            System.out.println(numant + 1);
        } else{
            System.out.println(numero + 1);
        }
    }
}