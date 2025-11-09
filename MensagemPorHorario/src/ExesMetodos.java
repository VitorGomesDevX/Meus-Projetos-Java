
import java.util.Scanner;

public class ExesMetodos {

    static String saudacao(String nome,int hora){
        if(hora<12){
            System.out.println("Bom dia," + nome + "'");
        } else if (hora<18) {
            System.out.println("Boa tarde," + nome + "'");
        } else {
            System.out.println("Boa noite," + nome + "'");
        }
        return nome;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a hora exata: ");
        int numero = input.nextInt();

        String resultado = saudacao(nome,numero);
        System.out.println(resultado);

    }
}