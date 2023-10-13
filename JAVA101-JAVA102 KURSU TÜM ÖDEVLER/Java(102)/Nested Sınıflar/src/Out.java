//outer class
public class Out {
	public int a=5;
	
	//inner class
	public class In{
		public int a=10;
		public void Run() {
			System.out.println(a);
			System.out.println(this.a); //iç sınıfın nesnesi olan a
			System.out.println(Out.this.a); //dış sınıfın nesnesine erişmek için kullanılan yöntem
		}
	}
	
	public void run() {
		
		In in=new In();
		in.Run();
	}

}
