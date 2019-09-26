package Atividades;
import java.util.Scanner;
public class Terceira {
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args[]){
        float p;
        float m;
        float g;
        float total;
        float pp = 1.3;
        float pm 2.2;
        float pg 3.0;
        System.out.print("Quantidade de sorvete pequeno: ");
        p = leia.nextInt();
        System.out.print("Quantidade de sorvete médio: ");
        m = leia.nextInt();
        System.out.print("Quantidade de sorvete grande: ");
        g = leia.nextInt();
        total = (p*pp)+(m*pm)+(g*pg);
        System.out.println("O valor total da sua compra foi de R$" + total);
    }
}