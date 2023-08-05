import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	 Scanner inp = new Scanner(System.in);


	    public void run(){
	        int secim;
	        System.out.println("Patika Store Yönetim Paneli");
	        System.out.println("1)Notebook İşlemleri");
	        System.out.println("2)Cep Telefonu İşlemleri");
	        System.out.println("3)Marka İşlemleri");
	        System.out.println("4)Çıkış yap");
	        System.out.print("Yapmak istediğiniz işlemi seçin :");
	        secim = inp.nextInt();


	        switch (secim) {
	            case 1:
	                Notebook c1 = new Notebook();
	                c1.menu();
	                break;
	            case 2:
	                CellPhone m1 = new CellPhone();
	                m1.menu();
	                break;
	            case 3:
	                Brand b1 =new Brand();
	                b1.menu();
	                break;
	            case 4:
	                System.exit(0);
	                break;
	            default:
	            System.out.println("Hatalı Giriş !");
	                break;
	        }


	    }

    
}
