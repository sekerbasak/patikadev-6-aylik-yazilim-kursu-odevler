
public class safeHause extends NormalLocation {

	public safeHause(Player player) {
		super(player, "Guvenli Ev");
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean onLocation() {
		
		System.out.println("Güvenli Evdesiniz!");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth() ); //güvenli eve gelince can yenilenir
		System.out.println("Caniniz yenilendi");
		return true;
	}

}
