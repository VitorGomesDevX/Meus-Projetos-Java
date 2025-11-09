import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAMANHO = 5;               // muda aqui se quiser um vetor maior/menor
        int[] vetor = new int[TAMANHO];
        int selecionado = 0;                 // posição atual selecionada (começa em 0)

        boolean sair = false;
        while (!sair) {
            System.out.println("\n===== GERENCIADOR DE VETOR (terminal) =====");
            System.out.println("Posição selecionada: " + selecionado);
            System.out.println("1 - Mostrar vetor");
            System.out.println("2 - Selecionar posição");
            System.out.println("3 - Adicionar/Alterar valor na posição selecionada");
            System.out.println("4 - Remover valor da posição selecionada (seta para 0)");
            System.out.println("5 - Ordenar vetor");
            System.out.println("6 - Limpar vetor (tornar todos 0)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.nextLine(); // limpar buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    mostrarVetor(vetor, selecionado);
                    break;
                case 2:
                    System.out.print("Digite a posição (0 a " + (TAMANHO - 1) + "): ");
                    try {
                        int pos = sc.nextInt();
                        if (pos >= 0 && pos < TAMANHO) {
                            selecionado = pos;
                            System.out.println("Posição selecionada: " + selecionado);
                        } else {
                            System.out.println("Posição inválida.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor inteiro a adicionar na posição " + selecionado + ": ");
                    try {
                        int valor = sc.nextInt();
                        vetor[selecionado] = valor;
                        System.out.println("Valor adicionado: vetor[" + selecionado + "] = " + valor);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        sc.nextLine();
                    }
                    break;
                case 4:
                    System.out.println("Removendo (setando 0) na posição " + selecionado + " (valor atual: " + vetor[selecionado] + ")");
                    vetor[selecionado] = 0;
                    System.out.println("Removido.");
                    break;
                case 5:
                    System.out.println("Ordenando vetor...");
                    Arrays.sort(vetor);
                    System.out.println("Vetor ordenado.");
                    mostrarVetor(vetor, selecionado);
                    break;
                case 6:
                    System.out.print("Tem certeza que quer limpar todo o vetor? (s/n): ");
                    String resp = sc.next();
                    if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("y")) {
                        Arrays.fill(vetor, 0);
                        System.out.println("Vetor limpo.");
                    } else {
                        System.out.println("Operação cancelada.");
                    }
                    break;
                case 0:
                    sair = true;
                    System.out.println("Saindo... até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }

    private static void mostrarVetor(int[] vetor, int selecionado) {
        System.out.println("\n--- Conteúdo do vetor ---");
        for (int i = 0; i < vetor.length; i++) {
            String marca = (i == selecionado) ? " <- [SELECIONADO]" : "";
            System.out.printf("Posição %d: %d%s%n", i, vetor[i], marca);
        }
        System.out.println("-------------------------");
    }
}