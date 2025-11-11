package JavaVjezbe6;

class Player {
	private String name;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	public Player(String name, int x, int y, int width, int height, int health) {
		if (!name.isEmpty()) {
			name = name.replaceAll("\\s+", " ").trim();
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
			this.name = name;
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		if (health >= 0 && health <= 100) {
			this.health = health;
		} else {
			System.out.println("Nepravilan unos health-a!");
		}
	}
	public String getName() {
		return name;
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
	public int getHealth() {
		return health;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setHealth(int health) {
		if (health >= 0 && health <= 100) {
			this.health = health;
		} else {
			System.out.println("Nepravilan unos!");
		}
	}
	@Override
	public String toString() {
		return "Player: " + this.name + " (" + this.x + "," + this.y + ") " + this.width + "x" + this.height + " HP = " + this.health; 
	}
}
