package projekat4;

public class Player extends GameObject {
	private int health;

	public Player(double x, double y, Collidable collider, int health) {
		super(x, y, collider);
		this.health = health;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDisplayName() {
		return "Player";
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void takeDamage(int damage) {
		this.health -= damage;
		if (this.health < 0) {
			this.health = 0;
		}
	}
	@Override
	public String toString() {
		return getDisplayName() + " Health: " + getHealth();
	}
 
}
