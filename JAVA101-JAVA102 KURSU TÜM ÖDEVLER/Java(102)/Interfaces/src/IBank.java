
public interface IBank {

	  final String hostIPAddressString="120.0.0.0";
	  boolean connect(String ipAddress);
	  boolean payment(Double price, String cardnumber,String date, String cvc);


}