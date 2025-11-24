package projekat4;

public class BossEnemy extends Enemy {

	public BossEnemy(double x, double y, Collidable collider, int effectiveDamage) {
		super(x, y, collider, effectiveDamage);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getEffectiveDamage() {
		return super.getEffectiveDamage() * 2;
	}

}
