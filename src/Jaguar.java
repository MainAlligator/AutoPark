import java.util.Objects;

public class Jaguar implements Cloneable {

    private String model;
    private int value;
    private int distanceTotal;

    public Jaguar(String model, int value, int distanceTotal) {
        this.model = model;
        this.value = value;
        this.distanceTotal = distanceTotal;
    }

    public String toString() {


        return "Jaguar:  " + model + " , " + value + " , " + distanceTotal + " km ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jaguar jaguar = (Jaguar) o;
        return value == jaguar.value &&
                distanceTotal == jaguar.distanceTotal &&
                Objects.equals(model, jaguar.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, value, distanceTotal);
    }

    @Override
    protected Jaguar clone() throws CloneNotSupportedException {
            return (Jaguar) super.clone();

    }
}
