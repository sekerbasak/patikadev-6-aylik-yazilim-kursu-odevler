import java.util.Scanner;

public class ToolStore extends NormalLocation {
 
	protected Scanner input=new Scanner(System.in);
	public ToolStore(Player player) {
		super(player, "Magaza");
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean onLocation() {
		System.out.println("-------------Magazaya hos geldin!-------------");
		boolean showMenu=true;
		while (showMenu) {
			System.out.println("1-Silahlar");
		System.out.println("2-Zirhlar");
		System.out.println("3-Cikis Yap");
		System.out.println("Yapmak istediginiz islemi seciniz");
		int selectStore=input.nextInt();
		
		while (selectStore<1 || selectStore>3) {
			System.out.println("Gecersiz deger! Lutfen tekrar giriniz..");
		   selectStore=input.nextInt();
		}
	 switch (selectStore) {
	case 1:
		printGuns();//silah listeleme
		BuyWeapon();//satın alam fonksiyonu
		break;
    case 2:
		printArmor();//zırhları listeleme
		BuyArmor();
		break;
     case 3:
    	 System.out.println("Bir daha bekleriz:)");
    	 showMenu=false;
	  break;
	   
	 }
  } return true;
		
}
	
	public void printGuns() { //silahları foreachle yazdırdık
		System.out.println("--------Silahlar--------");
	for (Weapon w : Weapon.weapons()) {
		System.out.println(w.getId()+"-) "+ w.getName()+" => Para :"+ w.getPrice()+" Hasar :"+w.getDamage()+">");
	
	}
	System.out.println("0-) Cikis Yap");
}
	public void printArmor() {//zırhları foreachle yazdırdık
		System.out.println("--------Zirhlar--------");
		for (Armor a : Armor.armors()) {
			System.out.println(a.getId()+"-) "+a.getName()+" => Blok :"+ a.getBlock()+"Ucret :"+a.getPrice()+">");
		}
		System.out.println("0-) Cikis Yap");
   
	}
	public void BuyWeapon() {//silah satın alımı
		System.out.println("Bir silah seciniz: ");
		int selecetweapon=input.nextInt();
		while (selecetweapon<0|| selecetweapon>Weapon.weapons().length){//dizinin uzunlupunu kontrol ettik 
			System.out.println("Gecersiz deger! Lutfen tekrar giriniz..");
		   selecetweapon=input.nextInt();
		}
		if (selecetweapon!=0) {
			Weapon selectedWeapon=Weapon.getWeaponObjectById(selecetweapon);// seçilen silahı değişkene atadık daha kolay işlem yapılması için
		System.out.println("---------------------------");
		if (selectedWeapon!=null) {
			 if (selectedWeapon.getPrice()>this.getPlayer().getMoney()) {//para yeterliş değilse
				System.out.println("Bunu alacak paran yok!");
			}else {
				System.out.println(selectedWeapon.getName()+ " silahini satin aldiniz");
		       int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice(); //satın alma işlemi sonucu oarayı azalttık
			   this.getPlayer().setMoney(balance);
			   System.out.println("Guncel paraniz: "+this.getPlayer().getMoney());
			   System.out.println("Onceki silahiniz: "+this.getPlayer().getInventory().getWeapon().getName());
			  this.getPlayer().getInventory().setWeapon(selectedWeapon); 
			System.out.println("Simdiki silahiniz: "+ this.getPlayer().getInventory().getWeapon().getName());
			}
		}
		}
		
		
	}
	public void BuyArmor() {
		System.out.println("Bir zirh seciniz: ");
		int selectArmor=input.nextInt();
		while (selectArmor<0|| selectArmor>Armor.armors().length) {
			System.out.println("Gecersiz deger! Lutfen tekrar giriniz..");
			selectArmor=input.nextInt();
		} 
		if (selectArmor!=0) {
			Armor selectedArmor=Armor.getArmorObjectById(selectArmor);// seçilen silahı değişkene atadık daha kolay işlem yapılması için
		System.out.println("---------------------------");
		if (selectedArmor!=null) {
			 if (selectedArmor.getPrice()>this.getPlayer().getMoney()) {
				System.out.println("Bunu alacak paran yok!");
			}else {
				System.out.println(selectedArmor.getName()+ " zirhini satin aldiniz");
		       int balance=this.getPlayer().getMoney()-selectedArmor.getPrice();
			   this.getPlayer().setMoney(balance);
			   System.out.println("Guncel paraniz: "+this.getPlayer().getMoney());
			   System.out.println("Onceki zirhiniz: "+this.getPlayer().getInventory().getArmor().getName());
			  this.getPlayer().getInventory().setArmor(selectedArmor); 
			System.out.println("Simdiki zirhiniz: "+ this.getPlayer().getInventory().getArmor().getName());
			}
		}
		}
		
	}
	
	
}
