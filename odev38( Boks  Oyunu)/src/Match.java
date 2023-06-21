import java.util.Random;

public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) ///kurucu fonskiyonla değer atamaları
    {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

}
    
    public void run() {
    	boolean whoFirst=WhoIsTheFirst();
    	if (isCheck()) {
    		while (this.f1.health>0 && this.f2.health>0) 
    		{
    			System.out.println("========YENI ROUND BASLADI!!=======");
				if (whoFirst)//true değeri gelirse 1 numaralı dövüşçü vuruyor demektir
				{
					this.f2.health=this.f1.hit(this.f2);
					System.out.println("Kalan Can: "+f2.health);
					if (isWin()) {
						break;
					}
					this.f1.health=this.f2.hit(this.f1);
					System.out.println("Kalan Can: "+f1.health);
					if (isWin()) {
						break;
					}
				}
				else {
					this.f1.health=this.f2.hit(this.f1);
					System.out.println("Kalan Can: "+f1.health);
					if (isWin()) {
						break;
					}
					this.f2.health=this.f1.hit(this.f2);
					System.out.println("Kalan Can: "+f2.health);
					if (isWin()) {
						break;
					}
				}
			}
			
		} else {
			System.out.println("Sporcu sikletleri uymuyor");

		}
		
	}
    
    boolean isCheck()//sporcu siklet kontrolü 
    {
    	return (this.f1.weight>= minWeight && this.f1.weight<=maxWeight) &&(this.f2.weight>= minWeight && this.f2.weight<=maxWeight);
    }
    
    boolean WhoIsTheFirst() {
    	Random rnd=new Random() ; 
    	int randomNumber=rnd.nextInt(2)+1; // 0 veya 1 döndürülür, bu yüzden +1 eklenir
    	
    	return (randomNumber==1)  ; // kimin ilk sırada  oynayacağını belirlemek için rastgele 0-1 arası rakam seçtik eğer 1 ise 1fighter1 değilse f2 önce başlar
	 }
    
    boolean isWin() {
    	if (this.f1.health==0) {
			System.out.println(this.f2.name+ " kazandı!!");
			return true;
		}if (this.f2.health==0) {
			System.out.println(this.f1.name+ " kazandı!!");
			return true;
		}else {
			return false;
		}
    }




}
