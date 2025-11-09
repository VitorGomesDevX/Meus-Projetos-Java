import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----- Jokenpô -----");
        System.out.println("1= Pedra");
        System.out.println("2= Papel");
        System.out.println("3= Tesoura");
        System.out.println("Digite a o número da sua jogada:");
        int op = input.nextInt();

        double ale = Math.random();
        int num = (int) (1 + ale * (3 - 1));

        switch (num) {
            case 1:
                if (op == num){
                    System.out.println("Empate!");
                } else if (op == 2){
                    System.out.println("Voce perdeu!");
                } else {
                    System.out.println("Voce GANHOU!");
                }
                break;
            case 2:
                if (op == num){
                    System.out.println("Empate!");
                } else if (op == 3){
                    System.out.println("Voce perdeu!");
                } else {
                    System.out.println("Voce GANHOU!");
                }
                break;
            case 3:
                if (op == num){
                    System.out.println("Empate!");
                } else if (op == 1){
                    System.out.println("Voce perdeu!");
                } else {
                    System.out.println("Voce GANHOU!");
                }
        }
        System.out.println("Voce escolheu " + op + " e o pc " + num);

    }
}

