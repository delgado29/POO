import java.awt.*;

public abstract class Figuras {

    private Color color;
    public Figuras(Color color){
        this.color=color;

    }
    public abstract double calcularArea();

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
