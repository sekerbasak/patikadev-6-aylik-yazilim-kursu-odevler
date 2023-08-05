import java.util.ArrayList;
import java.util.Scanner;

public class CellPhone extends Product {
	
     	 Scanner inp = new Scanner(System.in);
	    Brand b1 = new Brand();
	    ArrayList<CellPhone> phone = new ArrayList<>();
	    private String color;
	    private int batteryPow;

	    public CellPhone(int id, String name, int price, double discount, int stock, Brand brand, int ram, int storage,
	            double screenSize, String color,int batteryPow) {
	        super(id, name, price, discount, stock, brand, ram, storage, screenSize);
	        this.color = color;
	        this.batteryPow = batteryPow;
	    }

    public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	    public String getColor() {
	        return color;
	    }

	    public int getBatteryPow() {
	        return batteryPow;
	    }

	    @Override
	    public void menu() {
	        System.out.println("\n------Telefon Menüsü------ ");
	        System.out.println("1)Telefon Ekle");
	        System.out.println("2)Telefonları Listele");
	        System.out.println("3)Telefon Sil");
	        System.out.println("4)Çıkış");
	        
	        switch (inp.nextInt()) {
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
	                System.out.println("Hatalı giriş");
	                break;
	        }
	    }


	    @Override
	    public void addItem() {

	        System.out.println("\nÜrünün markasını seçin");
	        System.out.println();
	        System.out.println(" ---Markalar--- ");
	        b1.printBrands();
	        System.out.print("Marka Id seç : ");
	        Brand brand=Brand.getBrand(inp.nextInt());

	        System.out.print("Ürün ismini girin :");
	        String name = inp.next();
	        System.out.print("Fiyatını girin :");
	        int price = inp.nextInt();
	        System.out.print("İndirim oranı :");
	        double discount = inp.nextDouble();
	        System.out.print("Stok adedi :");
	        int stock = inp.nextInt();
	        System.out.print("Ram miktarı :");
	        int ram = inp.nextInt();
	        System.out.print("Hafızasını girin :");
	        int storage = inp.nextInt();
	        System.out.print("Ekran boyutunu girin :");
	        double screenSize = inp.nextDouble();
	        System.out.print("Rengini girin :");
	        String color = inp.next();
	        System.out.print("Batarya kapasitesi :");
	        int battery = inp.nextInt();

	        CellPhone m1 = new CellPhone(idGenerator(), name, price, discount, stock, brand , ram, storage, screenSize, color, battery);

	        this.phone.add(m1);

	        System.out.println("Telefon eklendi !");
	        System.out.println("Adı :"+m1.getName()+"\tId :"+m1.getId());

	        menu();
	        

	    }

	    @Override
	    public void getProduct() {
	        System.out.println("\n|ID------|Ürün Adı-----|Fiyatı-----|Markası-----|Stoğu-----|İndirim Oranı-----|RAM------|Ekran Boyutu-----|Hafızası-----|Renk-----|Batarya");
	        for (CellPhone mobilPhone : phone) {
	            System.out.println(mobilPhone.getId()+"       "+mobilPhone.getName()+"        "+mobilPhone.getPrice()+"         "+mobilPhone.getBrand().getName()+"        "+mobilPhone.getStock()+"           "+mobilPhone.getDiscount()+"             "+mobilPhone.getRam()+"           "+mobilPhone.getScreenSize()+"            "+mobilPhone.getStorage()+"         "+mobilPhone.getColor()+"          "+mobilPhone.getBatteryPow());
	        }

	        menu();
	        
	    }

	    @Override
	    public void deleteItem() {
	        System.out.print("\nSilmek istenen ürünün id sini gir :");
	        int inpId = inp.nextInt();

	        for (CellPhone mobilPhone : phone) {
	            if(mobilPhone.getId()==inpId){
	                System.out.println("Ürün başarıyla silindi !");
	                System.out.println("Menüye dönmek için 0 a basın !");
	                mobilPhone.deleteItem();
	                
	                break;
	            }else{
	                System.out.println("\nÜrün bulunamadı !");
	                
	            }
	        }

	        menu();
	        
	    }
	    
	    private int idGenerator(){
	        int id  = (int)(Math.random()*10000);
	        
	        for (CellPhone mobilPhone : phone) {

	            while(id == mobilPhone.getId()){
	                id  = (int)(Math.random()*10000);
	            }
	        }
	        return id;
	    }
}
