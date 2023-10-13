package loginmetot;

import java.util.Scanner;

public class merkez {

	static int haksayisi=3;
	static boolean aktif=true;
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		
		if (aktif) {
		   
			if (haksayisi>0) {
				while (aktif) {
			   System.out.print("Kullanıcı adını giriniz: ");
				String name=input.next();
				System.out.print("Şifrenizi giriniz: ");
				String password=input.next();
				
				if (login(name, password)) {
					System.out.println("Sisteme başarıyla giriş yapılmıştır");
			break;
				}
			else {
				System.out.println("Kullanıcı adı veya şifre yanlış!");
				if (haksayisi==0) {
					aktif=false;
					break;
				}
			}
				}
				
				
		       
				if (aktif==false) {
					System.out.println("Hak sayınız dolmuştur");
				}
				
			}else {
				System.out.println("Hak sayınız dolmuştur, hesabınız bloke oldu");
			}
		   
			
			
		}else {
			System.out.println("Lütfen yetkili biriyle görüşün");
		
		}

	}
	public static boolean login(String username,String password)
	{
		if (username.equals("basak")&& password.equals("123")) {
			
		return true;
		}
		else {
			haksayisi--;
			if (haksayisi==0) {
				
					
				aktif=false;
			}
			return false;
		}
	}

}
