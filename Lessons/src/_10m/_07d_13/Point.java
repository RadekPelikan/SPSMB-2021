package _10m._07d_13;

// Deklarace třídy Point
public class Point {
    // Vlastnosti instance třídy Bod (instanční proměnné)
    private int x;
    private int y;
    private int color;
    // V IntelliJ je klávesová zkratke `alt` + `insert` pro vložení getteru a setteru pro vlastnosti

    public int getX() {
//        return this.x;
        return x;   // this. není nutné, ale je lepší jej používat
    }

    public int getY() {
        return this.y;
    }

    public int getColor() {
        return this.color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("x: %d%n" +
                "y: %d%n" +
                "color: %d%n", this.x, this.y, this.color);
    }
}
