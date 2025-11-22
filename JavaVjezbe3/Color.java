public class Color {
    private int red;
    private int blue;
    private int green;

    public Color(int red, int green, int blue) {
        if (red <= 255 && red >= 0) {
            this.red = red;
        } else {
            System.out.println("Pogresna vrijednost za crvenu");
        }
        if (green <= 255 && green >= 0) {
            this.green = green;
        } else {
            System.out.println("Pogresna vrijednost za zelenu");
        }
        if (blue <= 255 && blue >= 0) {
            this.blue = blue;
        } else {
            System.out.println("Pogresna vrijednost za plavu");
        }   
    }
    public int getRed() {
        return red;
    }
    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        if (red <= 255 && red >= 0) {
            this.red = red;
        }
    }
    public void changeGreen(int change) {
        if (change <= 255 && change >= 0) {
            this.green = change;
        }
    }
    public void changeRed(int change) {
        if (change <= 255 && change >= 0) {
            this.red = change;
        }
    }
    public void changeBlue(int change) {
        if (change <= 255 && change >= 0) {
            this.blue = change;
        }
    }
    public void printColor() {
        System.out.printf("Red: %d, Green: %d, Blue: %d\n", red, green, blue);
    }
    public static void main(String[] args) {
        Color c1 = new Color(255, 200, 100);
        Color c2 = new Color(200, 155, 0);
        Color c3 = new Color(0, 100, 255);

        c1.printColor();
        c2.printColor();
        c3.printColor();

        c2.setRed(255);
        c2.printColor();
    }
}
/*1. Kreirati klasu Color koja ima tri privatna atributa: red, green i blue (vrijednosti 
0–255). Napraviti konstruktor koji postavlja početne vrijednosti svih atributa. 
a. Napraviti getere i setere za sve atribute. U seterima treba provjeriti da li je 
vrijednost između 0 i 255. Ako nije, ispisati poruku i ne mijenjati vrijednost.  
b. Napraviti metode addRed(int change), addGreen(int change) i addBlue(int 
change) koje mijenjaju vrijednost odgovarajuće boje za zadatu količinu 
(pozitivnu ili negativnu). Ako promjena izađe van [0,255], ispisati poruku i 
postaviti vrijednost na granicu (0 ili 255).  
c. Napraviti metodu printColor() koja ispisuje vrijednosti svih boja u obliku: "red: 
X, green: Y, blue: Z". */