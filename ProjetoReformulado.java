import java.util.Scanner;

public class CineDev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        char[][] sala = new char[10][20];
        
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = 'L';
            }
        }
        
        int opcao;
        do {
            System.out.println("\n===== Bem-vindo ao CineDev =====");
            System.out.println("1. Exibir Mapa de Assentos");
            System.out.println("2. Comprar Ingresso");
            System.out.println("3. Cancelar Compra de Ingresso");
            System.out.println("4. Exibir Relatório de Ocupação");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
              case 1: // Exibir Mapa da Sala
                System.out.println("Assentos: ");
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
                    
              case 2: // Compras de Ingressos
                System.out.println("Quantos ingressos deseja comprar?");
                  int n = scanner.nextInt();
                    
                  for (int k = 0; k < n; k++) {
                    System.out.println("Fileira (1-10): ");
                     int f = scanner.nextInt() - 1;
                     System.out.println("Assento (1-20): "); 
                     int a = scanner.nextInt() - 1;
                        
                     if (f < 0 || f >= 10 || a < 0 || a >= 20) {
                      System.out.println("Assento inválido!");
                      }
                    
                }
            }