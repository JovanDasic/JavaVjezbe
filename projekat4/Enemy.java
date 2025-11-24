package projekat4;

public class Enemy extends GameObject implements Attacker {
	private int effectiveDamage;

	public Enemy(double x, double y, Collidable collider, int effectiveDamage) {
		super(x, y, collider);
		this.effectiveDamage = effectiveDamage;
	}

	@Override
	public int getEffectiveDamage() {
		return effectiveDamage;
	}

	@Override
	public String getDisplayName() {
		return "Enemy";
	}
	@Override
	public String toString() {
		return getDisplayName() + " Damage: " + getEffectiveDamage();
	}

}
