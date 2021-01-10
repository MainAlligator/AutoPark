import java.util.Objects;

public class Mitsubishi {


    private String model;
    private int value;
    private int distanceTotal;

    public Mitsubishi(String model, int value, int distanceTotal) {
        this.model = model;
        this.value = value;
        this.distanceTotal = distanceTotal;
    }

    public String toString() {


        return "Mitsubishi:  " + model + " , " + value + " , " + distanceTotal + " km ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mitsubishi that = (Mitsubishi) o;
        return value == that.value &&
                distanceTotal == that.distanceTotal &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, value, distanceTotal);
    }
}


