import java.util.*;

public class Brand {
    private int id;
    private String name;
    Scanner input = new Scanner(System.in);
    
    private static TreeSet<Brand> brandList=new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public Brand() {
		// TODO Auto-generated constructor stub
	}
    static {
        createBrands();
    }

    public Brand(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void createBrands(){
        brandList.add(new Brand(1,"Samsung"));
        brandList.add(new Brand(2,"Lenovo"));
        brandList.add(new Brand(3,"Apple"));
        brandList.add(new Brand(4,"Huawei"));
        brandList.add(new Brand(5,"Casper"));
        brandList.add(new Brand(6,"Asus"));
        brandList.add(new Brand(7,"HP"));
        brandList.add(new Brand(8,"Xiaomi"));
        brandList.add(new Brand(9,"Monster"));
    }

    public static void printBrands() {
        System.out.println("Marka Listesi ");
        for (Brand brand : brandList) {
            System.out.println(brand.id + " " + brand.getName());
        }
        System.out.println("----------------------------");
    }

    public static Brand getBrand(int id){
        for(Brand b:brandList){
            if(id==b.getId()){
                return b;
            }
        }
        return null;
    }
    
    
    public void menu() {
    	System.out.println("\n ---------------Marka Menüsü-----------------");
    	System.out.println("1-Markaları Listele");
    	System.out.println("2-Marka Ekle");
    	System.out.println("3-çıkış");
    	int menuCase=input.nextInt();
    	switch (menuCase) {
		case 1: 
			printBrands();
			break;
		case 2:
			System.out.println("Eklemek istediğiniz markanın ismini giriniz: ");
		  String newBrand=input.nextLine();
		  addBrand(newBrand);
		break;
		case 3:
			System.exit(0);
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + menuCase);
		}
    }
    
    
    public void addBrand(String name) {
    	int newID=brandList.size()+1; //yeni eklenen markaya marka lsitin boyutundan 1 fazlasını veriyorz
    	brandList.add(new Brand(newID, name)); //yeni markayı lsteye ekleme
    	System.out.println("Eklenen marka: "+newID+" "+name);
   menu();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}