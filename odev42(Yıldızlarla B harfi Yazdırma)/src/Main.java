public class Main {
    public static void main(String[] args) {
        // Boyutları belirleyin
        int satir = 7;
        int sutun = 7;

        // Çok boyutlu dizi oluşturun
        char[][] harf = new char[satir][sutun];

        // Diziyi '*' ile doldurun
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                harf[i][j] = '*';
            }
        }

        // 'B' harfini oluşturun
        for (int i = 1; i < satir - 1; i++) {
            for (int j = 1; j < sutun - 2; j++) {
                harf[i][j] = ' ';
            }
        }
        harf[1][1] = '*';
        harf[2][1] = '*';
        harf[3][1] = '*';
        harf[4][1] = '*';
        harf[5][1] = '*';
        harf[6][1] = '*';
        harf[1][sutun - 2] = '*';
        harf[3][sutun - 2] = '*';
        harf[4][sutun - 2] = '*';
        harf[6][sutun - 2] = '*';
        harf[2][sutun - 2] = ' ';
        harf[5][sutun - 2] = ' ';

        // Diziyi ekrana yazdırın
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(harf[i][j]);
            }
            System.out.println();
        }
    }
}
