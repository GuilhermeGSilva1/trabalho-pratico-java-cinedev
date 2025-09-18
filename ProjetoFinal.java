import java.util.Scanner;

public class trabalho-pratico-java-cinedev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] sala = new char[10][20];

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = 'L';
            }
    
        int opcao;
        do {
            System.out.println("\n===== Bem-vindo ao CineDev =====");
            System.out.println("1. Exibir Mapa de Assentos");
            System.out.println("2. Comprar Ingressos");
            System.out.println("3. Cancelar Compra de Ingressos");
            System.out.println("4. Exibir Relatório de Ocupação da sala");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Exibição do mapa de Assentos
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

                case 2: // Comprar dos ingressos e diagnóstico de Assentos lives e ocupados
                    System.out.print("Quantos ingressos você deseja comprar? ");
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
                            System.out.println("Assento já esta ocupado.");
                            k--;
                        } else {
                            sala[f][a] = 'X';
                            System.out.println("Ingresso comprado com sucesso!");
                        }
                    }
                    
                    break;

                case 3: // Cancelar a compra do ingressos
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
                        System.out.println("Compra cancelada, assento foi liberado.");
                    }
                    
                    break;

                case 4: // Relatório de ocupação de Assentos 
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

                case 5: // Parte final para acabar o código
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (opcao != 5);

        scanner.close();
    }
}
