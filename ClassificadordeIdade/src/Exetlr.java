import java.util.Scanner;

public class Exetlr {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        String result = (idade <= 12 )?"Criança":(idade <= 19)?"Adolescente":(idade <= 59)?"Adulto":"Idoso";
        System.out.println(result);

    }
}
