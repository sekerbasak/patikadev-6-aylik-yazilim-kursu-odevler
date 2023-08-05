import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product {
	Scanner input=new Scanner(System.in);
	Brand b1=new Brand();
	ArrayList<Notebook> notebook=new ArrayList<>();

	public Notebook(int id, String name, int price, double discount, int stock, Brand brand, int ram, int storage,
			double screenSize) {
		super(id, name, price, discount, stock, brand, ram, storage, screenSize);
		// TODO Auto-generated constructor stub
	}
	
	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void menu() {
		System.out.println("\n-------Bilgisayar menüsü------");
		System.out.println("1-Bilgisayar Ekle");
		System.out.println("2-Bilgisayarları Listele");
		System.out.println("3-Bilgisayar Sİl");
		System.out.println("4-Çıkış");
		int select=input.nextInt();
		switch (select) {
		case 1:
			addItem();
			break;
        case 2:
			getProduct();
			break;
       case 3:
			deleteItem();
			break;
       case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Hatalı tuşa bastınız!");
			break;
		}
	}
	@Override
	public void addItem() {
		System.out.println("Ürünün markasını seçiniz : ");
		System.out.println("\n ----Markalar---");
		b1.printBrands();
		System.out.println("Marka ID seçiniz: ");
		int selectID=input.nextInt();
		Brand brand=Brand.getBrand(selectID);
		//ürün bilgilerini girdiği bölüm
		
		  System.out.print("Ürün ismini girin :");
	        String name =input .next();
	        System.out.print("Fiyatını girin :");
	        int price = input.nextInt();
	        System.out.print("İndirim oranı :");
	        double discount = input.nextDouble();
	        System.out.print("Stok adedi :");
	        int stock = input.nextInt();
	        System.out.print("Ram miktarı :");
	        int ram = input.nextInt();
	        System.out.print("Hafızasını girin :");
	        int storage = input.nextInt();
	        System.out.print("Ekran boyutunu girin :");
	        double screenSize = input.nextDouble();
	        //kullanıcının girdiği bilgilerle yenş bir nesne üretiyoruz
		Notebook n1=new Notebook(selectID, name, price, discount, stock, brand, ram, storage, screenSize);
	
		this.notebook.add(n1);//bunu da listeye ekledik
	    System.out.println("\n Yeni bilgisayar başarıyla eklendi!");
	    System.out.println("Adı :"+n1.getName()+"\tId :"+n1.getId());
	}

	@Override
	public void getProduct() {
		 System.out.println("\n|ID------|Ürün Adı-----|Fiyatı-----|Markası-----|Stoğu-----|İndirim Oranı-----|RAM------|Ekran Boyutu-----|Hafızası-----|Renk-----|Batarya");
	        for (Notebook computer : notebook) {
	            System.out.println(computer.getId()+"       "+computer.getName()+"        "+computer.getPrice()+"         "+computer.getBrand().getName()+"        "+computer.getStock()+"           "+computer.getDiscount()+"             "+computer.getRam()+"           "+computer.getScreenSize()+"            "+computer.getStorage());
	        }

	        menu();
		
	}

	@Override
	public void deleteItem() {
		
		System.out.println("\n Silmek istediğiniz ürünün IDsini giriniz");
		int deleteID=input.nextInt();
		for (Notebook notebook2 : notebook) {
			if (notebook2.getId()==deleteID) {
				System.out.println("Ürün başarıyla silindi!");
				System.out.println("Menüye dönemk için 0 a basınız");
				notebook2.deleteItem();
				break;
			}
			else {
				System.out.println("Ürün bulunamadı!");
			}
		}
		menu();
	}
	
	private int idGenerator(){
        int id  = (int)(Math.random()*10000);
        
        for (Notebook computer : notebook) {
            while(id == computer.getId()){
                id  = (int)(Math.random()*10000);
            }
        }
        return id;
    }

	
	
	
	
	
	
	
	
	
	
	
}
