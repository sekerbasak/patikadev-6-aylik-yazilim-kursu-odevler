
public class Armor {
  private int id;
  private int block;
  private int price;
  
  
  public Armor(int id, String name, int block, int price) {
	super();
	this.id = id;
	this.block = block;
	this.price = price;
	this.name = name;
}
  public static  Armor[] armors() {  //zırh türlerini üretttik
		Armor[] Armorlist= new Armor[3];
		Armorlist[0]=new Armor(1, "Hafif", 1, 15);
		Armorlist[1]=new Armor(2, "Orta", 3, 25);
		Armorlist[2]=new Armor(3, "Agir", 7, 45);
		return Armorlist;
	}
  public static Armor getArmorObjectById(int id)//idleri aracılığıyla zırhları yazdrdık
  {
		for (Armor a : Armor.armors()) {
			if(a.getId()==id) {
				return a;
			}
		}
		return null;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getBlock() {
	return block;
}
public void setBlock(int block) {
	this.block = block;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;
}
