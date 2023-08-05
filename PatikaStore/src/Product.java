
public class Product {
	
	
	private int id;
    private String name;
    private int price;
    private double discount;
    private int stock;
    private Brand brand;
    private int ram;
    private int storage;
    private double screenSize;
	public Product(int id, String name, int price, double discount, int stock, Brand brand, int ram, int storage,
			double screenSize) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
		this.screenSize = screenSize;
	}
    
	
	 public abstract void menu();
	 public abstract void addItem();
	 public abstract void getProduct();
	 public abstract void deleteItem();
	
	
	
	
	
	
	
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	    
}
