import universe.qual.Self;
import universe.qual.Bottom;
import universe.qual.Rep;
public class UI {

    private @Rep Calculator calc;

    public void writer(@Self UI this, final @Bottom Double num) {
        if (Double.isNaN(num)) {
        }
    }
}

class Calculator {

    public @Bottom Double calculateBi(@Self Calculator this) {
        return 0.0;
    }

}
