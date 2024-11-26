import java.util.Objects;
/**
 *
 * @author USER
 */
//Color Test
class Color {
    int red, green, blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    @Override
    public String toString() {
        return "Color(R:" + red + ", G:" + green + ", B:" + blue + ")";
    }
}

public class Lab2_HomeTask4 {
    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0);
        Color color2 = new Color(255, 0, 0);

        System.out.println("Are the colors equal? " + color1.equals(color2));
    }
}