package Atividades;
import java.util.*;
public class Sorteio {
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args[]){
        Random random = new Random();        
        int sort = random.nextInt(3);    
        int comp;
        Boolean querer = false;
        do{
            do{
                System.out.print("Digite um número para o sorteiro: ");
                comp = leia.nextInt();
                if(comp > sort){
                    System.out.println("Quase... Tente um menor!");
                }else if(comp < sort){
                    System.out.println("Quase... Tente um maior!");
                }else{
                    System.out.println("Parabéns, você ACERTOU!!!");
                }
            }while(comp != sort);
            System.out.println("Quer jogar de novo? ");
            querer = leia.nextBoolean();
        }while(querer);
    }
}

