import java.util.Random;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;

	public Fighter(String name, int damage, int health, int weight, int dodge)//yapıcı metotla ilk değerler atandı
	{
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        
        if (dodge>0 && dodge<=100) //yapıcı metotlayanlış değer girilmesini önledik
        {
			this.dodge = dodge;
		}
        else {
			this.dodge=0;
		}
	}
	
	int hit(Fighter foe ) //boksorlerin hasar verme fonksiyonu
	{
		System.out.println(this.name+ " => "+ foe.name+" "+ this.damage+" kadar hasar vurdu!");
		if (foe.isDodge()) //bloklama kontrolü
		{
			System.out.println("Vay canınaa! "+foe.name+" gelen hasarı blokladı!");
		    return foe.health;
		}
		
		if (foe.health-this.damage<0)//canı 0sa fonksiyonu durdurduk
		{
			return 0;
		}
		
		return foe.health-=this.damage;
	}
	
	boolean isDodge(){
		double ramdomNumber=Math.random()*100;//ondalıklı rastgele sayı üretir
		return ramdomNumber <=this.dodge;
		
	}
}
