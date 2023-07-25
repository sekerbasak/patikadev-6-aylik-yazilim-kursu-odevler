import java.util.Random;
import java.util.Scanner;
public abstract class BattleLocation extends Location{
	 Scanner input=new Scanner(System.in);
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    
	public BattleLocation(Player player, String name,Obstacle obstacle,String award, int maxObstacle) {
		super(player, name);
		this.obstacle=obstacle;
		this.award=award;
		this.maxObstacle=maxObstacle;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean onLocation() {
		int obsNumber=RandomObstacle(); //rastgele canavar sayısı
		System.out.println("Su an bulundugunuz mekan: "+this.getName());
		System.out.println("Dikkatli Ol! Burada "+obsNumber+" tane "+this.obstacle.getName()+" yasiyor!");
		System.out.println("<S>avas ya da <K>ac?");
		String selectRunorfight=input.nextLine().toUpperCase();//girilen harf büyük harfe çevrilir
		
	    if (selectRunorfight.equals("S")) //savaşma işlemi
		{
	    	System.out.println("\n \t !!!! SAVAS POZISYONU AL! BASLIYORUZ !!!! ");
	    	
			
			if (combat(obsNumber)) {
				System.out.println("Tebrikler, Iyi is cikardin!"+ this.getName()+ " bu mekandaki tum dusmanlari yendin!");
				return true;
			} 
			
		
		}
			
	    if (this.getPlayer().getHealth()<=0) {
	    	System.out.println("Buradan canli cikamadin!..");
			return false;
		}
		return true;		
	}
	
	public boolean combat(int obsNumber){
		
		for (int i = 1; i <= obsNumber; i++) {
			PlayerStatus();
			System.out.println("-------------------------");
			obstacleStatus( i);
			this.getObstacle().setHealth(this.getObstacle().getOriginalHealth()); //her bir canavarı yediğinde sıradaki canavarın canını yenilememeiz gerekiyor
			 while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0) //oyuncu ve canavarın canı 0dan büyük olduğu sürece dön
			{
				System.out.println("<V>ur ya da <K>ac!");
				String selectchoice=input.nextLine().toUpperCase(); //kullanıcı küçük harf girdiğinde büyük harfe çevirip kontrol yapar
				
				if (selectchoice.equals("V"))
				{
					System.out.println("Guzel Vurus!!");
					this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());// oyuncunun vuruşu. canaavarın canından ıyucunun hasarını çıkardık.
				    afterHit();
				    System.out.println("----------------------------");
				    if (this.getObstacle().getHealth()>0) {
				    	System.out.println("Kendini Koru, Atak geliyor!");
				    	int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();//canaavrın vermiş olduğu hasardan zırhımızın bloklama sayısından çıkardık bu da canavarın oyuncuya verdiği zarara eşdeperdir
				    	if (obstacleDamage<0) //eğer bloklama başarılıysa eksiye düşmemesi için zararı sıfırladık zırh korudu vurmamış gibi oldu
				    	{
							obstacleDamage=0;
						}
				    	this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage); //oyuncunun canından canavarın verdiği hasarı çıkardık
						afterHit();
					} 
				} else {
					return false;

				}
			}
			 if (this.getPlayer().getHealth()> this.getObstacle().getHealth() ) //eğer oyuncunun sağlığı canavardan büyükse oyunu kazannır
			 {
					System.out.println("Dusmani yendin! Iste Odulun Bunu Hak Ettin!");
				    System.out.println(this.getObstacle().getAward()+ " coin kesene  eklendi! Devam edelim..");
				   this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward()); //ganimeti
				    System.out.println("Guncel paraniz: "+this.getPlayer().getMoney());
				 
				 } 
			  if (this.getPlayer().getHealth()< this.getObstacle().getHealth()) {
				return false;
			}
			
		}return true;
		
	}
	public void afterHit()//her dövüşten sonra can bilgilendirmesi yapan fonksiyon
	{
		
		System.out.println("Senin Canin : "+this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getName()+" cani: "+ this.getObstacle().getHealth());
	    System.out.println();
	}
	
	public void PlayerStatus() //oyuncunun değerlerini ekrana yazdıran fonksiyon
	{
		System.out.println("\n \t Senin Degerlerin: ");
		System.out.println("----------------------------");
		System.out.println("Saglik   : "+this.getPlayer().getHealth());
		System.out.println("Silah    : "+this.getPlayer().getInventory().getWeapon().getName());
		System.out.println("Zirh     : "+this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Hasar    : "+this.getPlayer().getDamage());
		System.out.println("Bloklama : "+this.getPlayer().getInventory().getArmor().getBlock());
		System.out.println("Paran    : "+this.getPlayer().getMoney());
		
	}
	public void obstacleStatus(int i) //canavarın bilgilerini ekrana yazdırdık
	{
		System.out.println("\n \t"+i+ "."+""+this.getObstacle().getName()+" Degerleri: ");
		System.out.println("----------------------------");
		System.out.println("Saglik   : "+this.getObstacle().getHealth());
		System.out.println("Hasar    : "+this.getObstacle().getDamage());
		System.out.println("Odul     : "+this.getObstacle().getAward());
		
	}
	public int RandomObstacle() //kullanıcının karşısına çıkan canavar sayısını rastgele bulan fonksiyon
	{
		Random rnd=new Random();
		return rnd.nextInt(3)+1;
	}
	public Obstacle getObstacle() {
		return obstacle;
	}
	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}
	public String getAward() {
		return award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	public int getMaxObstacle() {
		return maxObstacle;
	}
	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

}
