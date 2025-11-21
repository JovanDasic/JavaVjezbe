package JavaVjezbe6;

class Enemy {
	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	public Enemy(String type, int x, int y, int width, int height, int damage) {
		if (!type.isEmpty()) {
			type = type.replaceAll("\\s+", " ").trim();
			type = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
			this.type = type;
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		if (damage >= 0 && damage <= 100) {
			this.damage = damage;
		} else {
			System.out.println("Nepravilan unos damage-a!");
		}
	}
	public String getType() {
		return type;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDamage() {
		return damage;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setDamage(int damage) {
		if (damage >= 0 && damage <= 100) {
			this.damage = damage;
		} else {
			System.out.println("Nepravilan unos!");
		}
	}
	@Override
	public String toString() {
		return "Enemy: " + this.type + " (" + this.x + "," + this.y + ") " + this.width + "x" + this.height + " DMG = " + this.damage; 
	} 
	public static Enemy fromString(String s) {
		String[] djelovi = s.split(";");
		String type = djelovi[0].trim();
		int x = Integer.parseInt(djelovi[1]);
		int y = Integer.parseInt(djelovi[2]);
		int width = Integer.parseInt(djelovi[3]);
		int height = Integer.parseInt(djelovi[4]);
		int damage = Integer.parseInt(djelovi[5]);
		
		return new Enemy(type, x, y, width, height, damage);
		
	}
}
