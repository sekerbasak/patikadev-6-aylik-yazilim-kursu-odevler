
public abstract class  GameChar {
	private int id;
	private String name;
	private int damage;  //seçilen karakteri oyundaki baş karakter yapan class
    private int health;
    public GameChar(int id, String name, int damage, int health, int money) {
		super();
		this.id = id;
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.money = money;
	}
	private int money;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
    

}
