package JavaVjezbe6;

import java.util.ArrayList;

public class Game {
	private Player p;
	ArrayList <Enemy> enemies = new ArrayList <Enemy>();
	ArrayList <String> eventLog = new ArrayList <String>();
	
	public Game(Player p) {	
		this.p = p;
	}
	
	public boolean checkCollision(Player p, Enemy e) {
		return p.getX() < e.getX() + e.getWidth() &&
	           p.getX() + p.getWidth() > e.getX() &&
	           p.getY() < e.getY() + e.getHeight() &&
	           p.getY() + p.getHeight() > e.getY();
	}
	public void decreaseHealth(Player p, Enemy e) {
		if (p.getHealth() > e.getDamage()) {
			String event = String.format("HIT: %s by %s for %d -> HP %d -> %d",
			        p.getName(), e.getType(), e.getDamage(),
			        p.getHealth(), p.getHealth() - e.getDamage());

			p.setHealth(p.getHealth() - e.getDamage());
			eventLog.add(event);
		} else {
			String event = "Player " + p.getName() + " DIED";
			p.setHealth(0);
			eventLog.add(event);
		}
	}
	public void addEnemy(Enemy e) {
		enemies.add(e);
		String event = "New enemy: " + e.getType();
		eventLog.add(event);
	}
	public ArrayList <Enemy> findByType(String query) {
		ArrayList <Enemy> list = new ArrayList <Enemy>();
		for (Enemy e : enemies) {
			if (e.getType().toLowerCase().contains(query.toLowerCase())) {
				list.add(e);
			}
		}
		return list;
	}
	public ArrayList <Enemy> collidingWithPlayer() {
		ArrayList <Enemy> list = new ArrayList <Enemy>();
		for (Enemy e : enemies) {
			if (checkCollision(p, e)) {
				list.add(e);
			}
		}
		return list;
	}
	public void resolveCollisions() {
		for (Enemy e : collidingWithPlayer()) {
			decreaseHealth(p, e);
		}
	}

	public static void main(String[] args) {
		Player p1 = new Player("Marko", 5, 8, 9, 9, 100);
		Game game = new Game(p1);
		
		game.addEnemy(new Enemy("Goblin", 3, 3, 2, 4, 10));
		game.addEnemy(new Enemy("Barbarian", 2, 5, 8, 4, 20));

        
		System.out.println("Svi neprijatelji");
		for (Enemy e : game.enemies) {
			System.out.println(e.toString());
		}
		
		String query = "gob";
		ArrayList <Enemy> listEnemies = game.findByType(query);
		System.out.println("Neprijatelji sa " + query);
		for (Enemy e : listEnemies) {
			System.out.println(e.toString());
		}
		
		ArrayList <Enemy> listCollisions = game.collidingWithPlayer();
		System.out.println("Neprijatelji u koliziji sa igracem: ");
		for (Enemy e : listCollisions) {
			System.out.println(e.toString());
		}
		
		System.out.println(p1.toString());
		game.resolveCollisions();
		System.out.println(p1.toString());
		
		System.out.println("---EVENT LOG---");
		for (String event : game.eventLog) {
			System.out.println(event);
		}
	}

}
