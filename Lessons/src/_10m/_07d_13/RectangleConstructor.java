package _10m._07d_13;

public class RectangleConstructor {
    public int height;
    public int widht;
    // V IntelliJ je klávesová zkratke `alt` + `insert` pro vložení constructoru

    public RectangleConstructor(int height, int widht) {
        this.height = height;
        this.widht = widht;
    }

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
