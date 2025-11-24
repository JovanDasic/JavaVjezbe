package projekat4;

public class CircleCollider implements Collidable {
    private double x;
    private double y;
    private double radius;

    public CircleCollider(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean intersects(Collidable other) {
        if (other instanceof CircleCollider) {
            CircleCollider c = (CircleCollider) other;

            double dx = this.x - c.x;
            double dy = this.y - c.y;
            double distanceSquared = dx * dx + dy * dy;
            double radiusSum = this.radius + c.radius;

            return distanceSquared <= radiusSum * radiusSum;
        }

        return false;
    }
}

