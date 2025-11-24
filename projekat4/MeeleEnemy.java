package projekat4;

public class MeeleEnemy extends Enemy {

	public MeeleEnemy(double x, double y, Collidable collider, int effectiveDamage) {
		super(x, y, collider, effectiveDamage);
	}

	@Override
	public String getDisplayName() {
		return "MeeleEnemy";
	}
	

}
