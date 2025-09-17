public class CineDev {
    public static void main(String[] args) {

        char[][] salaDeCinema = new char[10][20];

        for (int i = 0; i < salaDeCinema.length; i++) {
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                salaDeCinema[i][j] = 'L';
            }
        }
        System.out.print("Assentos:   ");
        for (int j = 0; j < salaDeCinema[0].length; j++) {
            System.out.printf("%2d ", j + 1);
        }
        System.out.println();

        for (int i = 0; i < salaDeCinema.length; i++) {
            System.out.printf("Fileira %2d: ", i + 1);
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                System.out.print("[" + salaDeCinema[i][j] + "]" );
            }
            System.out.println();
        }
    }
}
