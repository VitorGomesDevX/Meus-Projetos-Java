import java.util.Scanner;

public class Exeec {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        double n1 = input.nextDouble();
        System.out.println("Digite outro numero inteiro:");
        double n2 = input.nextDouble();
        System.out.println("--- Escolha um operador ---");
        System.out.println("1- + (adição)");
        System.out.println("2- - (subtração)");
        System.out.println("3- * (multiplicação)");
        System.out.println("4- / (divisão");
        int op = input.nextInt();

       switch(op){
           case 1:
               double s = n1 + n2;
               System.out.println(s);
               break;
           case 2:
               double sub = n1 - n2;
               System.out.println(sub);
               break;
           case 3:
               double mul = n1 * n2;
               System.out.println(mul);
               break;
           case 4:
               double div = n1 / n2;
               System.out.println(div);
               break;
           default:
               System.out.println("Opção Inválida");
       }
    }
}

