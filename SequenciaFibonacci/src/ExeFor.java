public class ExeFor {
    public static void main(String[] args) {
        int a = 0,b = 1;

        System.out.print("Sequencia de Fibonacci: " + a + " " + b);

        for (int i = 3; i <= 15;i++) {
            int soma = a + b;
            System.out.print(" " + soma);
            a= b;
            b=soma;
        }
    }
}