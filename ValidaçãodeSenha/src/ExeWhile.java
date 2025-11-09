import java.util.Scanner;

public class ExeWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a senha de 4 digítos: ");
        int n = input.nextInt();

        while (n != 1234){
            System.out.println("tente novamente:");
            n = input.nextInt();
        }
        System.out.println("SENHA VÁLIDA");
    }
}
