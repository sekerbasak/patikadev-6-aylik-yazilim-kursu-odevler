import java.util.Scanner;
public class Player {
	
	Scanner inputScanner= new Scanner(System.in);
	private int id;
	private int damage;
	private int health;
	private int money;
	private String name;
	private String characterName;
	private Inventory inventory;
	private int originalHealth;
	
	public Player(String name) {
		this.name=name;
		this.inventory=new Inventory();
		this.originalHealth=health;}
    public void selectChar() {
    	Samurai samurai=new Samurai(); //karakter nesneleri türettik
    	Archer archer=new Archer();
    	Knight knight=new Knight();
    	System.out.println("--------------------------------------------------------------------------------------------");
    	 System.out.println("Karakterler"); //ekrana bilgileri yazdırdık
    	System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("1)"+samurai.getName() +" ==> \t Damage: "+ samurai.getDamage()+"\t Saglik: "+samurai.getHealth()+"\t Money: "+samurai.getMoney() );
		System.out.println("2)"+archer.getName() +"  ==> \t Damage: "+ archer.getDamage()+"\t Saglik: "+archer.getHealth()+"\t Money: "+archer.getMoney() );
		System.out.println("3)"+knight.getName() +"  ==> \t Damage: "+ knight.getDamage()+"\t Saglik: "+knight.getHealth()+"\t Money: "+knight.getMoney() );
	    System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lutfen bir karakter giriniz..");
       
        int selecetChar=inputScanner.nextInt(); //kullanıcı karakter seçiyor
        if (selecetChar==1) {
			initPlayer(samurai);
		}
        else if (selecetChar==2) {
			initPlayer(archer);	
		}
        else if(selecetChar==3){
			initPlayer(knight);	
		}
        else {
			initPlayer(samurai); //hatalı tuş sonucu default olarak samura karakterini atadım
			
		}
      //  System.out.println("Secimin:  "+this.getCharacterName() +"  ==> \t Damage: "+ this.getDamage()+"\t Saglik: "+this.getHealth()+"\t Money: "+this.getMoney() );
        
    }
    public void printPlayerInfo() //kullanıcının seçtiği karakterin bilgilerini ekrana yazdım
    {
    	System.out.println(this.getCharacterName()+"=> "+"Silahin:  "+this.getInventory().getWeapon().getName() +"\t Zirhin: "+this.getInventory().getArmor().getName()+"\t Bloklama: "+this.getInventory().getArmor().getBlock()+"\t Hasariniz: "+ this.getInventory().getWeapon().getDamage() +"\t Saglik: "+this.getHealth()+"\t Para: "+this.getMoney() );
        
    }
	public void initPlayer(GameChar gameChar)//seçtiği karakteri oyundaki karaktere atadık
	{
	  this.setId(gameChar.getId());
      this.setDamage(gameChar.getDamage());
      this.setHealth(gameChar.getHealth());
      this.setOriginalHealth(gameChar.getHealth());
      this.setMoney(gameChar.getMoney());
      this.setCharacterName(gameChar.getName());
    	
    }
	
	//encapsulation//get ve set metotları
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
	public int getTotalDamage() //total hasarı veren özel fonksiyon
	{
		return (damage+this.getInventory().getWeapon().getDamage());
	}
	public int getDamage() {
		return (getTotalDamage());
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		
		return health;
	}
	public int getOriginalHealth() {
		return originalHealth;
	}
	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}
	public void setHealth(int health) { //negatif deperlerin önüne geçtik{
		if(health<0) {
			health=0;
		}
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}