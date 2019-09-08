package Atividades;
import java.util.Scanner;
public class Questoes {
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args[]){
        int vag;
        int lugar;
        boolean querer = false;
        int vfinal = 0;
        int matriz[][] = new int[6][6];
        do{
            System.out.println("1 - R$100,00");
            System.out.println("2 - R$200,00");
            System.out.println("3 - R$300,00");
            System.out.println("Escolha o seu vagão: ");
            vag = leia.nextInt();
            switch(vag){
                case 1:
                    System.out.println("Escolha o seu assento: ");
                    lugar = leia.nextInt();
                    if(matriz[vag][lugar] != 1){
                        System.out.println("Escolha efetuada com sucesso!!!");
                        matriz[vag][lugar] = 1;
                        vfinal += 100;
                    }else{
                        System.out.println("Assento já escolhido nesse vagão!!!");
                    }
                    break;
                case 2:
                    System.out.println("Escolha o seu assento: ");
                    lugar = leia.nextInt();
                    if(matriz[vag][lugar] != 1){
                        System.out.println("Escolha efetuada com sucesso!!!");
                        matriz[vag][lugar] = 1;
                        vfinal += 200;
                    }else{
                        System.out.println("Assento já escolhido nesse vagão!!!");
                    }
                    break;
                case 3:
                    System.out.println("Escolha o seu assento no 3: ");
                    lugar = leia.nextInt();
                    System.out.println(lugar);
                    if(matriz[vag][lugar] != 1){
                        System.out.println("Escolha efetuada com sucesso!!!");
                        matriz[vag][lugar] = 1;
                        vfinal += 300;
                    }else{
                        System.out.println("Assento já escolhido nesse vagão!!!");
                    }
                    break;
                default:
                    System.out.println("Assento inválido!!!");
            }
            System.out.println("Deseja comprar de novo?");
            querer = leia.nextBoolean();
        }while(querer);
        System.out.println("O valor total da compra foi: R$" + vfinal + ",00");
    }
}
