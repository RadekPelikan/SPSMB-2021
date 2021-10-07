package _10m._07d_13;

public class Rectangle {
    public int height;
    public int widht;

    public int circumference() {
        return 2 * (this.height + this.widht);
    }

    public int volume() {
        return this.height * this.widht;
    }

    @Override
    public String toString() {
        return String.format("height: %d%n" +
                "widht: %d%n" +
                "circumference: %d%n" +
                "volume: %d%n", this.height, this.widht, this.circumference(), this.volume());
    }
}
