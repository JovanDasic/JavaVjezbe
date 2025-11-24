package projekat4;

public class RectangleCollider implements Collidable {
	private double x;
	private double y;
	private double height;
	private double width;

	public RectangleCollider(double x, double y, double height, double width) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean intersects(Collidable other) {
		if (other instanceof RectangleCollider) {
		     RectangleCollider r = (RectangleCollider) other;

            boolean noOverlap = this.x + this.width < r.x ||
                                r.x + r.width < this.x ||
                                this.y + this.height < r.y ||
                                r.y + r.height < this.y;

            return !noOverlap;
		}
	       
		return false;
	}

}
