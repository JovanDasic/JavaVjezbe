class Player {
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;

    public Player(int x, int y, int width, int height, int health) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if (health <= 100 && health > 0) {
            this.health = health;
        } else {
            System.out.println("Health nije validan!");
        } 
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
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setHealth(int health) {
        if (health < 100 && health > 0) {
        this.health = health;
        } else {
            System.out.println("Health nije validan!");
        } 
    }
    public void decreaseHealth(Enemy e) {
        int newHealth = this.health - e.getDamage();
        this.health = Math.max(newHealth, 0);
        System.out.println("Novi health je " + this.health);
    }
}
class Enemy {
    private int x;
    private int y;
    private int width;
    private int height;
    private int damage;

    public Enemy(int x, int y, int width, int height, int damage) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if (damage <= 100 && damage > 0) {
            this.damage = damage;
        } else {
            System.out.println("Damage nije validan!");
        }
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
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setDamage(int damage) {
        if (damage <= 100 && damage > 0) {
            this.damage = damage;
        } else {
            System.out.println("Damage nije validan!");
        }
    }
}
public class Game {
    public static boolean checkCollision(Player p, Enemy e) {
        return p.getX() < e.getX() + e.getWidth() &&
               p.getX() + p.getWidth() > e.getX() &&
               p.getY() < e.getY() + e.getHeight() &&
               p.getY() + p.getHeight() > e.getY();
    }
    public static void main(String[] args) {
        Player p = new Player(5, 5, 10, 6, 100);
        Enemy e = new Enemy(5, 5, 2, 3, 20);
        if (checkCollision(p, e)) {
            System.out.println("preklapanje postoji");
            p.decreaseHealth(e);
        } else {
            System.out.println("nema preklapanja");
        }
    }
}




/*Kreirati klasu Player sa atributima: x, y (pozicija igrača – integer), width, height 
(dimenzije – integer), health (životni bodovi – integer, između 0 i 100).  
Kreirati klasu Enemy sa atributima: x, y (pozicija neprijatelja – integer), width, 
height (dimenzije – integer), damage (vrijednost napada – integer, između 0 i 100). 
Obje klase trebaju imati konstruktor za postavljanje vrijednosti, privatne atribute i 
odgovarajuće getere i setere (sa provjerama za health i damage). Napraviti metodu 
u glavnoj public klasi Game checkCollision(Player p, Enemy e) koja provjerava da li 
se igrač i neprijatelj preklapaju (sudar/kolizija). Ako dođe do kolizije, metod 
decreaseHealth (Player p, Enemy e) smanjuje vrijednost health-a igrača za damage 
vrijednost neprijatelja (ne smije pasti ispod 0). Testiranje radite u public klasi Game 
(tako nazvati klasu pri kreiranju fajla, a ostale za ostale klase ne treba koristiti 
public keyword ispred class riječi).  */