package Atividades;
import java.util.Scanner;
public class Informacoes {
    public static Scanner leia = new Scanner (System.in);
    public static String maior(boolean maior){
        String result;
        if(maior){
            result = "Você já é de maior!";
        }else{
            result = "Você ainda é de menor!";
        }
        return result;
    }
    public static void main (String args[]){
        float idade;
        boolean maior;
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        
        if(idade >= 18){
            maior = true;
        }else{
            maior = false;
        }
        System.out.println(maior(maior));
    }
}
