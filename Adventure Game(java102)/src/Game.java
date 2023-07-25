import java.util.Scanner;
public class Game {
	Scanner inputScanner= new Scanner(System.in);
	
	public void start() {
		System.out.println("Macera oyununa hos geldiniz!");
	//	System.out.println("Lutfen adinizi giriniz : ");
	//	String playerName=inputScanner.nextLine();
		Player player=new Player("Basak");
		System.out.println("Sevgili "+player.getName()+" bu karanlik ve sisli adaya hos geldin!");
		System.out.println("Burada yasanan her sey gercek!");
		System.out.println("Lutfen istedigin karakteri sec..ozgursun");
		
		player.selectChar();
		
		
		Location location=null;
	
		 while (true) {
			 player.printPlayerInfo();
			System.out.println();  
			    	System.out.println(" ##############Bolgeler############# \n");
			    	System.out.println("1-Guvenli Ev --> Burda dusman yok..burasi sizin icin guvenli!");
			    	System.out.println("2-Dukkan     --> Silah veya zirh satin alabilirsin!");
			    	System.out.println("3-Magara     --> ODUL: <YEMEK> Dikkatli Ol! Zombi cikabilir..!");
			        System.out.println("4-Orman      --> ODUL: <ODUN>  Dikkatli Ol! Vampir cikabilir..!");
			        System.out.println("5-Nehir      --> ODUL: <SU>    Dikkatli Ol! Ayi cikabilir..!");
			    	System.out.println("0-Cikis Yap  --> Oyunu sonlandır");
			    	System.out.println("Lutfen gitmek istediginiz mekani seciniz");
			    	int selectLocation=inputScanner.nextInt();
			    	
			    	switch (selectLocation) {
					case 1:
						location=new safeHause(player);
						break;
					case 2:
				        location=new ToolStore(player);
						break;
					case 3:
						location=new Cave(player);
						break;
					case 4:
						location=new Forest(player);
						break;
					case 5:
						location=new River(player);
						break;
					case 0:
						location=null;
						break;
						
					default:
						System.out.println("Lutfen gecerli bir sayi giriniz!");
						
					}
			    	
			   if(location==null) //konum seçilmediyse oyundan çık
			   {

	    		System.out.println("Bu karanlık ve sisli adaya anca bu kadar dayanabildin..oyun bitti");
				break;
		  }
		  else if (!location.onLocation())//false dönerse yani oyun kaybedilirse oyundan çıksın 
		  {
			System.out.println("GAME OVER!");
			break;
		} 
		  
		 }
		 
		
	
	
	}
	
}
