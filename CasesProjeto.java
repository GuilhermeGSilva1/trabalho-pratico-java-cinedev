import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] sala = new char[10][20];
        int opcao = 0;

switch (opcao) {
                case 1: // Case de Exibição do mapa
                    System.out.print("Assentos:   ");
                    for (int j = 0; j < sala[0].length; j++) {
                        System.out.printf("%2d ", j + 1);
                    }
                    System.out.println();
                    for (int i = 0; i < sala.length; i++) {
                        System.out.printf("Fileira %2d: ", i + 1);
                        for (int j = 0; j < sala[i].length; j++) {
                            System.out.print("[" + sala[i][j] + "]");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // Case comprar dos ingressos
                    System.out.print("Quantos ingressos deseja comprar? ");
                    int n = scanner.nextInt();

                    for (int k = 0; k < n; k++) {
                        System.out.print("Fileira (1-10): ");
                        int f = scanner.nextInt() - 1;
                        System.out.print("Assento (1-20): ");
                        int a = scanner.nextInt() - 1;

                        if (f < 0 || f >= 10) {
                            System.out.println("Fileira inválida. Escolha de 1 a 10.");
                            k--;
                        } else if (a < 0 || a >= 20) {
                            System.out.println("Assento inválido. Escolha de 1 a 20.");
                            k--;
                        } else if (sala[f][a] == 'X') {
                            System.out.println("Assento já ocupado.");
                            k--;
                        } else {
                            sala[f][a] = 'X';
                            System.out.println("Ingresso comprado com sucesso!");
                        }
                    }
                    break;

                case 3: // Case de Cancelar a compra do ingresso
                    System.out.print("Fileira (1-10): ");
                    int f = scanner.nextInt() - 1;
                    System.out.print("Assento (1-20): ");
                    int a = scanner.nextInt() - 1;

                    if (f < 0 || f >= 10) {
                        System.out.println("Fileira inválida. Escolha de 1 a 10.");
                    } else if (a < 0 || a >= 20) {
                        System.out.println("Assento inválido. Escolha de 1 a 20.");
                    } else if (sala[f][a] == 'L') {
                        System.out.println("Esse assento já está livre.");
                    } else {
                        sala[f][a] = 'L';
                        System.out.println("Compra cancelada, assento liberado.");
                    }
                    break;

                case 4: // Case do Relatório de ocupação de assentos
                    int total = sala.length * sala[0].length;
                    int ocupados = 0;
                    for (int i = 0; i < sala.length; i++) {
                        for (int j = 0; j < sala[i].length; j++) {
                            if (sala[i][j] == 'X') {
                                ocupados++;
                            }
                        }
                    }
                    int livres = total - ocupados;
                    double percentual = (ocupados * 100.0) / total;

                    System.out.println("\n===== Relatório de Ocupação =====");
                    System.out.println("Total de assentos: " + total);
                    System.out.println("Assentos ocupados: " + ocupados);
                    System.out.println("Assentos livres: " + livres);
                    System.out.printf("Percentual de ocupação: %.2f%%\n", percentual);
                    break;

                case 5: // Case da saida
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
}
