import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNasc = input.nextInt();

        int idade = 2025 - anoNasc;
        System.out.println("Idade: " + idade);

        String sit = ((idade >= 16 && idade < 18 ) || (idade >70))? "Voto opcional":"Voto não opcional";
        System.out.println(sit);


    }
}
