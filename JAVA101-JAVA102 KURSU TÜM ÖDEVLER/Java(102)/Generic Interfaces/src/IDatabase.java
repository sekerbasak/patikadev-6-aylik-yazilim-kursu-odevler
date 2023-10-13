
public interface IDatabase<T>//generic interface
{
	
	public boolean insert(T data);
	public boolean delete(T data);
	public boolean update(T data);
	
	
	public T select(T data);

}
