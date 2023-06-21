public class Main {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 6, 8, 2, 4, 10, 12, 10, 8, 14};

        System.out.println("Tekrar Eden Cift Sayilar:");
        bulVeYazdir(dizi);
    }

    public static void bulVeYazdir(int[] dizi) {
        int uzunluk = dizi.length;
        boolean[] ziyaretEdildi = new boolean[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            int sayi = dizi[i];
            if (!ziyaretEdildi[i]) {
                boolean tekrarVarMi = false;
                for (int j = i + 1; j < uzunluk; j++) {
                    if (sayi == dizi[j]) {
                        ziyaretEdildi[j] = true;
                        tekrarVarMi = true;
                        break;
                    }
                }
                if (tekrarVarMi && sayi % 2 == 0) {
                    System.out.println(sayi);
                }
            }
        }
    }
}