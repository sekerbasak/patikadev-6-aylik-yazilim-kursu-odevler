
public class Student <T>implements IDatabase<T>{

	@Override
	public boolean insert(T data) {
		System.out.println("Ekleme islemi basarili!");
		System.out.println(data);
		return true;
	}

	@Override
	public boolean delete(T data) {
		System.out.println("Silme islemi basarili!");
		return true;
	}

	@Override
	public boolean update(T data) {
		System.out.println("Guncellme islemi basarili!");
		return true;
	}

	@Override
	public T select(T data) {
		System.out.println("Secme islemi basarili!");
		return null;
	}

	

}
