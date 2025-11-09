import java.util.Scanner;

public class ProjetoFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero e descubra o seu fatorial" + " : ");
        int n = input.nextInt();
        int f = 1;
        int c = n;

        while (c >= 1) {
            f *= c;
            c--;
        }
        System.out.println(f);
    }
}
