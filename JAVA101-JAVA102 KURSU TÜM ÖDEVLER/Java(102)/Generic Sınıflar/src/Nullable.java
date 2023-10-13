
public class Nullable <X>//generic sınıflar yani veri tipi bilinmeyen sınıflar
{
	
	private final X value;

	public Nullable(X value) {
		super();
		this.value = value;
	}

	public X getValue() {
		return value;
	}
	
	public boolean isNull() {
		return this.getValue()==null;
	}
	public void run() {
		if (isNull()) {
			System.out.println("Girdiginiz deger null");
		}
		else {
		  System.out.println("Girdiginiz deger: "+this.getValue());
		}
	}

}
