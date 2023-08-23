
import com.sun.security.jgss.GSSUtil;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] mineMap;
    String[][] gameMap;
    int mineCounter;
    int a;
    int b;
    int count;
    boolean isTrue = true;


    public MineSweeper(int row, int col) //kullanıcıdan alınan değeri parametre olarak atayan constructer
    {
        this.rowNumber = row;
        this.colNumber = col;
        this.gameMap = new String[row][col];     //oyun haritası ve mayın haritası dizieri tanımladık
        this.mineMap = new String[row][col];
        this.mineCounter = (row * col) / 4;

    }

    public void MineMap() {    //mayın tarlasını kullanıcının girdiği değerlerle çizdiriyoruz
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
            	mineMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }

    public void randomNumber() //random değerlerle mayınları matrise yerleştiriyoruz
    {
        Random r = new Random();
        for (int i = 0; i < this.mineCounter; i++) {
            int rsayi = r.nextInt(this.rowNumber);
            int rsayi2 = r.nextInt(this.colNumber);
            if (!this.mineMap[rsayi][rsayi2].equals("*")) {
                this.mineMap[rsayi][rsayi2] = "*";
            }
        }
    }

    public void printmayinMap() //ekrana rastgele yerleştireilen mayınların oldupğu matrisi bastırıyoruz
    {
        System.out.println("Mayinlarin Konumu");
        randomNumber();
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");
    }

    public void printGameMap() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void indisSecme() {
        Scanner inp = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.print("Satir Giriniz : ");
            a = inp.nextInt();
            System.out.print("Sutun Giriniz : ");
            b = inp.nextInt();
            if (a > rowNumber || b > colNumber) {
                System.out.println("Map sinirlari disinda secim yaptınız tekrar giriniz !");
                continue;
            }
            if (mineMap[a][b].equals("*")) {
                System.out.println("Game Over!");
                break;

            }
            control();
            if (finish()) {

                System.out.println("Tebrikler kazandiniz :)))))");
                break;
            }
        }
    }

    public void control() {
        count = 0;
        for (int i = (a - 1); i <= (a + 1); i++) {
            for (int j = (b - 1); j <= (b + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[a][b] = String.valueOf(count);
        this.mineMap[a][b] = String.valueOf(count);
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
    public void run() {
        MineMap();
        printmayinMap();
        indisSecme();
    }
}