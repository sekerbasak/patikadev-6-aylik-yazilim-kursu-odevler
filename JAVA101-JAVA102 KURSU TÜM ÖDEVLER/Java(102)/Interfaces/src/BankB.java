
public class BankB implements IBank {

	private String bankName;
	private String terminalID;
	private String password;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getTerminalID() {
		return terminalID;
	}
	public void setTerminalID(String terminalID) {
		this.terminalID = terminalID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BankB(String bankName, String terminalID, String password) {
		super();
		this.bankName = bankName;
		this.terminalID = terminalID;
		this.password = password;
	}
	@Override
	public boolean connect(String ipAddress) {
		System.out.println("Kullanıcı IP "+ipAddress);
		System.out.println("Makine IP "+ this.hostIPAddressString);
		System.out.println(getBankName()+" bankasina baglanildi!");
	
		return true;
	}
	@Override
	public boolean payment(Double price, String cardnumber, String date, String cvc) {
		// TODO Auto-generated method stub
		return true;
	}

}
