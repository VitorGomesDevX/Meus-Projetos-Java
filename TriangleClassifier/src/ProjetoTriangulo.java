import java.util.Scanner;

public class ProjetoTriangulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o segmento 'A': ");
        int a = input.nextInt();
        System.out.print("Digite o segmento 'B': ");
        int b = input.nextInt();
        System.out.print("Digite o segmento 'C': ");
        int c = input.nextInt();

        //verificar se é um triangulo
        if (a <  b + c && b < a + c && c <  a + b) {
            System.out.println("Forma um Triangulo");
            //verificar qual triangulo é
              if (a == b && b == c){
                System.out.print("Triangulo Equilátero");
              } else if (a != b && b != c && a != c){
                System.out.print("Triangulo Escaleno");
              } else {
                System.out.print("Triangulo Isósceles");
              }
        } else {
            System.out.println("Não forma um Triangulo");
            System.out.println("-------");
        }
    }
}