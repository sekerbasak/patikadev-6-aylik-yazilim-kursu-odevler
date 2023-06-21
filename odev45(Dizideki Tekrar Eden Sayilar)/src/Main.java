
public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] elemanlar = new int[dizi.length];
        int[] frekanslar = new int[dizi.length];
        int elemanSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            boolean tekrarEden = false;

            for (int j = 0; j < elemanSayisi; j++) {
                if (elemanlar[j] == eleman) {
                    frekanslar[j]++;
                    tekrarEden = true;
                    break;
                }
            }

            if (!tekrarEden) {
                elemanlar[elemanSayisi] = eleman;
                frekanslar[elemanSayisi] = 1;
                elemanSayisi++;
            }
        }

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(elemanlar[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
        }
    }
}

