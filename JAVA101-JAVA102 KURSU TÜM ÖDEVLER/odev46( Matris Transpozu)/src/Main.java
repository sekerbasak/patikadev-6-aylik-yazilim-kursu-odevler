
public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Transpozunu bulma
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Transpozunu ekrana yazdırma
        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("Transpozu:");
        matrisiYazdir(transpoz);
    }

    public static void matrisiYazdir(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}
